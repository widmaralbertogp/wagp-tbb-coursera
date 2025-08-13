#!/usr/bin/bash
clear
echo "Next write whatever you want"
echo " "
read origin
echo " "
echo "Next we are going to remplace all the vowels on your text"
echo " "
echo $origin | tr "aeiou" "_"
echo " "
echo "Thanks for coding with us"
echo " "
echo "Next we are going to remplace all the consonat on your text"
echo " "
echo $origin | tr -c "aeiou" "_"
echo " "
