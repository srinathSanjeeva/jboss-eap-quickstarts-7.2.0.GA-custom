#!/bin/sh -vex

docker build --tag=sanjeevas/jaxws-pojo-client:1.0 client/

docker run -d -p 8081:8080 -p 9991:9990 sanjeevas/jaxws-pojo-client:1.0