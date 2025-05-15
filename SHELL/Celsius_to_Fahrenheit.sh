#!/bin/bash


echo "Enter temperature in Celsius:"
read celsius


fahrenheit=$(echo "scale=2; ($celsius * 9 / 5) + 32" | bc)


echo "$celsius°C is equal to $fahrenheit°F"