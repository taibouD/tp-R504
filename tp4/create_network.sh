#!/bin/bash
docker network create net-tp4
if [ $? != ]
then 
	echo "erreur à l'étape ***"
	exit
fi
