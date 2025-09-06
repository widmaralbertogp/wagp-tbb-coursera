#!/bin/bash
# Script para reparar error NO_PUBKEY en Ubuntu Noble
# Autor: Widmar Alberto Gómez Pérez
# Uso: sudo bash fix_apt_keys.sh

KEY="871920D1991BC93C"
KEYRING="/etc/apt/keyrings/ubuntu-archive-keyring.gpg"
SOURCES="/etc/apt/sources.list"

echo "=== Reparando clave faltante de Ubuntu (NO_PUBKEY $KEY) ==="

# Crear carpeta de keyrings si no existe
sudo mkdir -p /etc/apt/keyrings

# Descargar clave desde keyserver
echo "-> Descargando clave $KEY desde keyserver.ubuntu.com..."
gpg --keyserver keyserver.ubuntu.com --recv-keys $KEY
gpg --export $KEY | sudo tee $KEYRING > /dev/null

# Respaldar sources.list
echo "-> Respaldando $SOURCES en ${SOURCES}.bak"
sudo cp $SOURCES ${SOURCES}.bak

# Reescribir sources.list con la firma
echo "-> Actualizando $SOURCES para usar signed-by..."
sudo bash -c "cat > $SOURCES" <<EOF
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-updates main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-security main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-backports main restricted universe multiverse
EOF

# Actualizar repositorios
echo "-> Ejecutando apt update..."
sudo apt update

echo "=== Listo ✅. Error de NO_PUBKEY corregido. ==="
