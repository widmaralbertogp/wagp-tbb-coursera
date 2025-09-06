#!/bin/bash
# Script completo para Ubuntu Noble:
# 1️⃣ Repara error NO_PUBKEY
# 2️⃣ Elimina aplicaciones innecesarias
# Autor: Widmar Alberto Gómez Pérez
# Uso: sudo bash ubuntu_cleanup.sh

# -----------------------------
# Parte 1: Reparar NO_PUBKEY
# -----------------------------
KEY="871920D1991BC93C"
KEYRING="/etc/apt/keyrings/ubuntu-archive-keyring.gpg"
SOURCES="/etc/apt/sources.list"

echo "=== Reparando clave faltante de Ubuntu (NO_PUBKEY $KEY) ==="

sudo mkdir -p /etc/apt/keyrings
gpg --keyserver keyserver.ubuntu.com --recv-keys $KEY
gpg --export $KEY | sudo tee $KEYRING > /dev/null

# Respaldar sources.list
sudo cp $SOURCES ${SOURCES}.bak

# Reescribir sources.list con la firma
sudo bash -c "cat > $SOURCES" <<EOF
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-updates main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-security main restricted universe multiverse
deb [signed-by=$KEYRING] http://archive.ubuntu.com/ubuntu noble-backports main restricted universe multiverse
EOF

# Actualizar repositorios
sudo apt update

# -----------------------------
# Parte 2: Eliminar aplicaciones
# -----------------------------
echo "=== Eliminando aplicaciones innecesarias ==="

# Videos (Totem)
sudo apt remove --purge -y totem

# Power Statistics
sudo apt remove --purge -y gnome-power-statistics

# System Monitor
sudo apt remove --purge -y gnome-system-monitor

# LibreOffice completo
sudo apt remove --purge -y libreoffice* libreoffice-common

# Transmission (GTK, CLI y Daemon)
sudo apt remove --purge -y transmission-gtk transmission-cli transmission-daemon

# Multimedia opcionales
sudo apt remove --purge -y rhythmbox cheese shotwell simple-scan

# Oficina / utilidades opcionales
sudo apt remove --purge -y thunderbird remmina deja-dup

# Accesorios GNOME
sudo apt remove --purge -y gnome-maps gnome-weather gnome-calculator

# Juegos GNOME
sudo apt remove --purge -y aisleriot gnome-mines gnome-sudoku

# Limpieza final
sudo apt autoremove -y
sudo apt autoclean

echo "=== Proceso completado. Ubuntu limpio y repositorios corregidos ✅ ==="
