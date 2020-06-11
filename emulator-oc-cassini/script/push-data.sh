#!/bin/bash 

export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib
# Clean the yang space
# Start sysrepo

#cd /root/config
#/root/sysrepo/build/examples/application_changes_example openconfig-platform &
#sleep 2
#sysrepocfg --import=init-components.xml --format=xml 
#/root/sysrepo/build/examples/application_changes_example openconfig-terminal-device &
#sleep 2
#sysrepocfg --import=init-terminal-device.xml --format=xml 

netopeer2-server

# Push power configuration
#sleep 5
#/usr/local/bin/netconf-console --host 127.0.0.1 --port 830 -u root -p root --rpc=/root/script/config-power.xml
tail -f
