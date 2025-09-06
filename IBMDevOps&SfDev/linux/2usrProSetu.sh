#!/bin/bash

# Configuración de conexión MariaDB
MARIADB_USER="root"
MARIADB_PASS="Ue=25aug25"
MARIADB_DB="projects_db"

# Configuración de conexión PostgreSQL
PG_USER="project_user"
PG_PASS="Ue=25aug25"
PG_DB="projects_db"

# Configuración de conexión MongoDB
MONGO_USER="project_user"
MONGO_PASS="Ue=25aug25"
MONGO_DB="projects_db"

# Función para inicializar MariaDB
echo "[MariaDB]"
mysql -u $MARIADB_USER -p$MARIADB_PASS $MARIADB_DB <<EOF
CREATE TABLE IF NOT EXISTS empleados (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  nombre_completo VARCHAR(100) NOT NULL,
  usuario_login VARCHAR(100) NOT NULL UNIQUE,
  contraseña VARCHAR(100) NOT NULL,
  descripcion VARCHAR(255),
  oficina VARCHAR(100),
  telefono VARCHAR(50),
  direccion VARCHAR(255),
  puesto VARCHAR(100),
  departamento VARCHAR(100),
  gerente VARCHAR(100),
  perfil_usuario VARCHAR(100),
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
EOF
if [ $? -eq 0 ]; then
  echo "Tabla 'empleados' lista en MariaDB."
else
  echo "Error al crear/verificar tabla 'empleados' en MariaDB."
fi

# Función para inicializar PostgreSQL
echo "\n[PostgreSQL]"
export PGPASSWORD=$PG_PASS
psql -U $PG_USER -d $PG_DB <<EOF
CREATE TABLE IF NOT EXISTS empleados (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  nombre_completo VARCHAR(100) NOT NULL,
  usuario_login VARCHAR(100) NOT NULL UNIQUE,
  contraseña VARCHAR(100) NOT NULL,
  descripcion VARCHAR(255),
  oficina VARCHAR(100),
  telefono VARCHAR(50),
  direccion VARCHAR(255),
  puesto VARCHAR(100),
  departamento VARCHAR(100),
  gerente VARCHAR(100),
  perfil_usuario VARCHAR(100),
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
EOF
if [ $? -eq 0 ]; then
  echo "Tabla 'empleados' lista en PostgreSQL."
else
  echo "Error al crear/verificar tabla 'empleados' en PostgreSQL."
fi

# Función para inicializar MongoDB
echo "\n[MongoDB]"
mongosh -u $MONGO_USER -p $MONGO_PASS --authenticationDatabase $MONGO_DB <<EOF
use $MONGO_DB;
db.createCollection('empleados');
EOF
if [ $? -eq 0 ]; then
  echo "Colección 'empleados' lista en MongoDB."
else
  echo "No se pudo conectar a MongoDB o crear la colección 'empleados'."
fi

echo "===== Inicialización y verificación completada ====="
