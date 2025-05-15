#!/bin/bash


echo "Enter a number:"
read num


if [ "$num" -eq 2 ]; then
  echo "$num is the only even prime number."
else
  echo "$num is NOT the even prime number."
fi