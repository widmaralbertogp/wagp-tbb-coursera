#!/bin/bash

# Configuración de credenciales
MARIADB_USER="root"
MARIADB_PASS="Ue=25aug25"
POSTGRES_USER="project_user"
POSTGRES_DB="projects_db"
POSTGRES_PASS="Ue=25aug25"
MONGO_USER="project_user"
MONGO_PASS="Ue=25aug25"
MONGO_DB="projects_db"

# ----- MariaDB -----
echo "[MariaDB]"
mysql -u $MARIADB_USER -p$MARIADB_PASS -e "CREATE TABLE IF NOT EXISTS empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    nombre_completo VARCHAR(100) NOT NULL,
    usuario_login VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    oficina VARCHAR(100),
    telefono VARCHAR(20),
    direccion VARCHAR(255),
    puesto VARCHAR(50),
    departamento VARCHAR(50),
    gerente VARCHAR(100),
    perfil VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)" $POSTGRES_DB && echo "Tabla 'empleados' lista en MariaDB." || echo "Error al crear tabla en MariaDB."

# ----- PostgreSQL -----
echo -e "\n[PostgreSQL]"
export PGPASSWORD=$POSTGRES_PASS
psql -U $POSTGRES_USER -d $POSTGRES_DB -c "CREATE TABLE IF NOT EXISTS empleados (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    nombre_completo VARCHAR(100) NOT NULL,
    usuario_login VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    oficina VARCHAR(100),
    telefono VARCHAR(20),
    direccion VARCHAR(255),
    puesto VARCHAR(50),
    departamento VARCHAR(50),
    gerente VARCHAR(100),
    perfil VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)" && echo "Tabla 'empleados' lista en PostgreSQL." || echo "Error al crear tabla en PostgreSQL."

# ----- MongoDB -----
echo -e "\n[MongoDB]"
mongosh "mongodb://$MONGO_USER:$MONGO_PASS@127.0.0.1:27017/$MONGO_DB" --eval 'db.createCollection("empleados")' && echo "Colección 'empleados' lista en MongoDB." || echo "No se pudo conectar a MongoDB o crear la colección 'empleados'."

echo "===== Inicialización y verificación completada ====="
