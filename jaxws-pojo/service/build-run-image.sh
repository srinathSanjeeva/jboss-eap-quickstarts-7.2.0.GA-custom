#!/bin/sh -vex

docker build --tag=sanjeevas/jaxws-pojo:1.0 service/

docker run -d -p 8080:8080 -p 9990:9990 sanjeevas/jaxws-pojo:1.0

docker logs -f containerId 