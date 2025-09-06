#!/bin/bash
# Script para conectar SSH a Termux vía ADB
# Autor: Widmar Alberto Gómez Pérez

PORT=8022
USER="u0_a260"
HOST="localhost"

echo "=== Verificando carpeta .ssh en Termux ==="
adb shell "mkdir -p /data/data/com.termux/files/home/.ssh && chmod 700 /data/data/com.termux/files/home/.ssh"

echo "=== Revisa que tu llave pública ya esté en authorized_keys ==="
echo "Si no, copia tu ~/.ssh/id_rsa.pub al archivo authorized_keys en Termux"

echo "=== Activando forward ADB ==="
adb forward tcp:$PORT tcp:$PORT

echo "=== Conectando via SSH ==="
ssh -p $PORT $USER@$HOST
