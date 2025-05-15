#!/bin/bash

echo "Squares of the first 10 natural numbers:"

for i in {1..10}
do
  square=$((i * i))
  echo "Square of $i is $square"
done