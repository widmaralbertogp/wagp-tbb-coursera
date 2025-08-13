!/usr/bin/bash
clear
echo "Look up the orinal files pets.txt"
echo " "
cat  pets.txt
echo " "
echo "Next we change your file lower to upercaset"
echo " "
cat pets.txt | tr "[a-z]" "[A-Z]"
echo " "
echo "Thanks for coding with us"
