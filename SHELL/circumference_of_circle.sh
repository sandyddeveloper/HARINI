#!/bin/bash


echo "Enter the radius of the circle:"
read radius

circumference=$(echo "scale=2; 2 * 3.14 * $radius" | bc)


echo "The circumference of the circle is: $circumference"