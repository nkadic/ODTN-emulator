#/bin/bash

cd "$(dirname "$0")"
TARGET=`pwd`
source ./build.properties
cd $TARGET
sudo docker build --build-arg http_proxy="$http_proxy" --build-arg https_proxy="$https_proxy"  -t netconf_emu . 
