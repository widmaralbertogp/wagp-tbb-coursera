#!/bin/bash

echo "==> Verificando estado de Apache..."
sudo systemctl status apache2 --no-pager -l

echo -e "\n==> Probando configuración Apache..."
sudo apache2ctl configtest

echo -e "\n==> Revisando puerto 80 ocupado..."
sudo ss -tulpn | grep :80

echo -e "\n==> Verificando /etc/mime.types..."
if [ ! -f /etc/mime.types ]; then
  echo "Archivo /etc/mime.types NO encontrado. Descargando..."
  sudo curl -o /etc/mime.types https://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types
else
  echo "/etc/mime.types existe."
fi

echo -e "\n==> Reinstalando Apache y utilidades..."
sudo apt update
sudo apt install --reinstall -y apache2 apache2-bin apache2-utils

echo -e "\n==> Desenmascarando Apache si está bloqueado..."
sudo systemctl unmask apache2

echo -e "\n==> Intentando iniciar Apache..."
sudo systemctl start apache2

echo -e "\n==> Estado final de Apache:"
sudo systemctl status apache2 --no-pager -l
