#!/bin/bash

# Configuración de conexión
MARIADB_USER="project_user"
MARIADB_PASS="Ue=25aug25"
MARIADB_DB="projects_db"

PG_USER="project_user"
PG_PASS="Ue=25aug25"
PG_DB="projects_db"

MONGO_DB="projects_db"
MONGO_COLLECTION="projects"
MONGO_USER="project_user"
MONGO_PASS="Ue=25aug25"

echo "===== Verificación de bases de datos ====="

# --- MariaDB ---
echo -e "\n[MariaDB]"
if mysql -u "$MARIADB_USER" -p"$MARIADB_PASS" -e "USE $MARIADB_DB; SHOW TABLES LIKE 'projects';" | grep -q "projects"; then
    echo "Conexión a MariaDB exitosa."
    echo "Tabla 'projects' existe."
else
    echo "No se pudo conectar a MariaDB o tabla 'projects' no existe."
fi

# --- PostgreSQL ---
echo -e "\n[PostgreSQL]"
export PGPASSWORD="$PG_PASS"
if psql -U "$PG_USER" -d "$PG_DB" -tAc "SELECT 1 FROM information_schema.tables WHERE table_name='projects';" | grep -q 1; then
    echo "Conexión a PostgreSQL exitosa."
    echo "Tabla 'projects' existe."
else
    echo "No se pudo conectar a PostgreSQL o tabla 'projects' no existe."
fi
unset PGPASSWORD

# --- MongoDB ---
echo -e "\n[MongoDB]"
if mongosh -u "$MONGO_USER" -p "$MONGO_PASS" --authenticationDatabase "$MONGO_DB" --quiet --eval "db.getCollectionNames().includes('$MONGO_COLLECTION')" "$MONGO_DB" | grep -q true; then
    echo "Conexión a MongoDB exitosa."
    echo "Colección 'projects' existe."
else
    echo "No se pudo conectar a MongoDB o colección 'projects' no existe."
fi

echo -e "\n===== Verificación completada ====="
