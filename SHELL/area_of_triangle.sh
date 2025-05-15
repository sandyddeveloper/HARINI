#!/bin/bash


echo "Enter the base of the triangle:"
read base

echo "Enter the height of the triangle:"
read height

area=$(echo "scale=2; 0.5 * $base * $height" | bc)


echo "The area of the triangle is: $area"