#!/usr/bin/bash

# Cambiar al directorio /var/www
cd /var/www

# Verificar que el cambio fue exitoso
if [ "$PWD" == "/var/www" ]; then
  echo "Ahora estás en el directorio /var/www"
else
  echo "No se pudo cambiar al directorio /var/www"
fi
