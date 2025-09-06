# 🚑 Fix para crear un usuario válido en MariaDB

# 1. Ingresa como root en modo seguro (sin pedir contraseña)
sudo systemctl stop mariadb
sudo mysqld_safe --skip-grant-tables &

# 2. Conéctate sin contraseña
mysql -u root

# 3. Dentro de MariaDB, ejecuta esto:
FLUSH PRIVILEGES;

ALTER USER 'root'@'localhost' IDENTIFIED BY 'Ue=25aug25';

CREATE USER 'admin'@'localhost' IDENTIFIED BY 'Ue=25aug25';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

EXIT;

# 4. Detén el modo seguro y reinicia mariadb
sudo systemctl stop mariadb
sudo systemctl start mariadb

# 5. Ahora ya deberías poder entrar con:
mysql -u admin -p
