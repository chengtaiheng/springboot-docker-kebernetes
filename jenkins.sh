#!/usr/bin/env bash
# ----------------------------------------------------------------------------------------------------------------------
# 不可以删除此文件 jenkins
# 需要通过此文件构建docker镜像
# ----------------------------------------------------------------------------------------------------------------------
# 删除原有的镜像
docker rmi 192.168.99.115/chth/springboot-docker-kebernetes:1.0.0
docker rmi 192.168.99.115/chth/springboot-docker-kebernetes:latest

#用pom文件 clean 打包项目构建docker镜像
mvn -f ./pom.xml clean package docker:build

mvn clean -q