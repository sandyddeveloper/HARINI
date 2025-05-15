#!/bin/bash

echo "Enter a number:"
read num


root=$(echo "sqrt($num)" | bc)


square=$((root * root))


if [ "$square" -eq "$num" ]; then
  echo "$num is a perfect square."
else
  echo "$num is NOT a perfect square."
fi