#!/bin/bash


echo "Welcome! Let's calculate the area of a rectangle."


read -p "Enter the length: " length


read -p "Enter the width: " width

area=$((length * width))


echo "The area of the rectangle is: $area"