#!/bin/bash

# Configuración de conexión
MARIADB_USER="root"
MARIADB_PASS="Ue=25aug25"
MARIADB_DB="projects_db"

PG_USER="project_user"
PG_PASS="Ue=25aug25"
PG_DB="projects_db"

MONGO_USER="project_user"
MONGO_PASS="Ue=25aug25"
MONGO_DB="projects_db"

echo "===== Inicialización y Verificación de Bases de Datos ====="

### MariaDB / MySQL
echo -e "\n[MariaDB]"
mysql -u $MARIADB_USER -p$MARIADB_PASS -e "CREATE DATABASE IF NOT EXISTS $MARIADB_DB;" 2>/dev/null
mysql -u $MARIADB_USER -p$MARIADB_PASS -D $MARIADB_DB -e "CREATE TABLE IF NOT EXISTS projects (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);" 2>/dev/null

if mysql -u $MARIADB_USER -p$MARIADB_PASS -D $MARIADB_DB -e "DESCRIBE projects;" &>/dev/null; then
    echo "Conexión a MariaDB exitosa."
    echo "Tabla 'projects' existe o fue creada."
else
    echo "No se pudo conectar a MariaDB o crear la tabla."
fi

### PostgreSQL
echo -e "\n[PostgreSQL]"
sudo -u postgres psql -tc "SELECT 1 FROM pg_database WHERE datname = '$PG_DB'" | grep -q 1 || sudo -u postgres psql -c "CREATE DATABASE $PG_DB OWNER $PG_USER;"
sudo -u postgres psql -d $PG_DB -c "CREATE TABLE IF NOT EXISTS projects (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);" 2>/dev/null
sudo -u postgres psql -c "ALTER USER $PG_USER WITH PASSWORD '$PG_PASS';"
sudo -u postgres psql -d $PG_DB -c "GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO $PG_USER;"
sudo -u postgres psql -d $PG_DB -c "GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO $PG_USER;"

if sudo -u postgres psql -d $PG_DB -c "\d projects" &>/dev/null; then
    echo "Conexión a PostgreSQL exitosa."
    echo "Tabla 'projects' existe o fue creada."
else
    echo "No se pudo conectar a PostgreSQL o crear la tabla."
fi

### MongoDB
echo -e "\n[MongoDB]"
mongo_cmd=$(cat <<EOF
use $MONGO_DB
db.createUser({
  user: "$MONGO_USER",
  pwd: "$MONGO_PASS",
  roles: [{ role: "readWrite", db: "$MONGO_DB" }]
})
db.createCollection("projects")
EOF
)

mongosh --quiet --eval "$mongo_cmd" 2>/dev/null

if mongosh --quiet --username $MONGO_USER --password $MONGO_PASS --authenticationDatabase $MONGO_DB --eval "db.projects.findOne()" &>/dev/null; then
    echo "Conexión a MongoDB exitosa."
    echo "Colección 'projects' existe o fue creada."
else
    echo "No se pudo conectar a MongoDB o crear la colección."
fi

echo -e "\n===== Verificación e Inicialización completada ====="

echo "[MongoDB]"
MONGO_STATUS=$(mongosh --quiet --eval "
use projects_db;
var userExists = db.getUser('project_user') !== null;
var collectionExists = db.getCollectionNames().includes('projects');
if(userExists && collectionExists){
  print('Conexión a MongoDB exitosa. Usuario y colección existen.');
} else {
  print('No se pudo conectar a MongoDB o usuario/colección no existen.');
}
")
echo "$MONGO_STATUS"
