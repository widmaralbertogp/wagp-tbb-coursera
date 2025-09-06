#!/bin/bash

# Configuración de conexiones
MARIADB_USER="project_user"
MARIADB_PASS="Ue=25aug25"
MARIADB_DB="projects_db"

PG_USER="project_user"
PG_PASS="Ue=25aug25"
PG_DB="projects_db"

MONGO_USER="project_user"
MONGO_PASS="Ue=25aug25"
MONGO_DB="projects_db"

echo "===== Verificación de tablas en bases de datos ====="

# MariaDB
echo -e "\n[MariaDB]"
if mysql -u "$MARIADB_USER" -p"$MARIADB_PASS" -D "$MARIADB_DB" -e "DESCRIBE empleados;" &> /dev/null; then
    echo "Tabla 'empleados' existe."
else
    echo "Tabla 'empleados' no existe o no se pudo conectar."
fi

# PostgreSQL
echo -e "\n[PostgreSQL]"
export PGPASSWORD="$PG_PASS"
if psql -U "$PG_USER" -d "$PG_DB" -c "\d empleados" &> /dev/null; then
    echo "Tabla 'empleados' existe."
else
    echo "Tabla 'empleados' no existe o no se pudo conectar."
fi
unset PGPASSWORD

# MongoDB
echo -e "\n[MongoDB]"
if mongosh -u "$MONGO_USER" -p "$MONGO_PASS" --authenticationDatabase "$MONGO_DB" "$MONGO_DB" --eval 'db.getCollectionNames().includes("empleados")' | grep true &> /dev/null; then
    echo "Colección 'empleados' existe."
else
    echo "Colección 'empleados' no existe o no se pudo conectar."
fi

echo -e "\n===== Verificación completada ====="
# --- Verificación MongoDB ---
echo "[MongoDB]"
MONGO_OUTPUT=$(mongosh -u $MONGO_USER -p $MONGO_PASS --authenticationDatabase $MONGO_DB $MONGO_DB --quiet --eval "db.getCollectionNames().includes('empleados')")
if [ "$MONGO_OUTPUT" == "true" ]; then
echo "Colección 'empleados' existe."
else
echo "Colección 'empleados' no existe o no se pudo conectar."
fi


echo
echo "===== Verificación completada ====="
