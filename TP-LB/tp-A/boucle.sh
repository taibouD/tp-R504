#!/bin/bash
for ((i=1; i<=500; i++)); do
    a=$(curl -s http://localhost:83)
    echo "$i: $a"
done


