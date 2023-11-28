#!/bin/bash

docker build -t im-nginx-lb .

mkdir -p shared1
mkdir -p shared2

echo "<h1>Hello 1</h1>" > shared1/index.html
echo "<h1>Hello 2</h1>" > shared2/index.html


docker run -d \
	-p 81:80 \
	--name nginx1 \
	-v $(pwd)/shared1:/usr/share/nginx/html \
	nginx:latest
	
docker run -d \
	-p 82:80 \
	--name nginx2\
	-v $(pwd)/shared2:/usr/share/nginx/html \
	nginx:latest
	 
docker run -d --name lb -p 83:80 im-nginx-lb
	



