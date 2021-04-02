#!/usr/bin/env bash
docker run --privileged=true -d --name zookeeper --publish 2181:2181  -d zookeeper:latest

# zookeeper ip:172.18.52.12