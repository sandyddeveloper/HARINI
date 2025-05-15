#!/bin/bash

echo "Enter a number:"
read num


digits=${#num}

sum=0
temp=$num

while [ $temp -gt 0 ]
do
  digit=$((temp % 10))
  # Calculate digit^digits using bc
  power=$(echo "$digit ^ $digits" | bc)
  sum=$((sum + power))
  temp=$((temp / 10))
done

if [ $sum -eq $num ]; then
  echo "$num is an Armstrong number."
else
  echo "$num is NOT an Armstrong number."
fi