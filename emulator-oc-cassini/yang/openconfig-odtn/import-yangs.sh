# Clean the yang space
#sysrepoctl --uninstall --module=iana-if-type --revision=2014-05-08
#sysrepoctl --uninstall --module=ietf-ip --revision=2014-06-16
#sysrepoctl --uninstall --module=ietf-interfaces --revision=2014-05-08
# Install new yang files about openconfig


cd /root/yang/openconfig-odtn
# Change a leafref to leaf with type uint32, because of parsing errors
sed -i '487,491d' openconfig-terminal-device.yang
sed -i '486a type uint32;' openconfig-terminal-device.yang
# Modify operational schema into configurable schema
sed -i '/config false;/d' openconfig-platform-transceiver.yang
sed -i '/config false;/d' openconfig-platform.yang
sed -i '/config false;/d' openconfig-terminal-device.yang

# Before importing, you need to remove the last augment block for
# "/oc-if:interfaces/oc-if:interface/oc-if:state" in openconfig-platform-transceiver.yang.
# Because it will cause parsing errors.
# line number between [481, 500]
sed -i '481,500d' openconfig-platform-transceiver.yang
# You can also use the command below, but it's not recommended.
# ls | xargs -I {} sysrepoctl --install  {}  
sysrepoctl --install  ietf-interfaces.yang -a
sysrepoctl --install  iana-if-type.yang -a
sysrepoctl --install  openconfig-extensions.yang   -a
sysrepoctl --install  openconfig-types.yang   -a
sysrepoctl --install  openconfig-yang-types.yang  -a 
sysrepoctl --install  openconfig-platform-types.yang  -a 
sysrepoctl --install  openconfig-transport-types.yang   -a
sysrepoctl --install  openconfig-interfaces.yang   -a
sysrepoctl --install  openconfig-if-ethernet.yang   -a
sysrepoctl --install  openconfig-alarm-types.yang   -a
sysrepoctl --install  openconfig-platform.yang   -a
sysrepoctl --install  openconfig-platform-linecard.yang   -a
sysrepoctl --install  openconfig-platform-port.yang   -a
sysrepoctl --install  openconfig-platform-transceiver.yang   -a
sysrepoctl --install  openconfig-terminal-device.yang   -a
sysrepoctl --install  openconfig-transport-line-common.yang   -a
sysrepoctl --install  openconfig-transport-line-protection.yang   -a
#EXTRA LINES
cd /root/yang/openconfig-odtn

sysrepoctl --install  iana-crypt-hash@2014-08-06.yang   -a
sysrepoctl --install  iana-hardware@2018-03-13.yang   -a
sysrepoctl --install  iana-if-type@2017-01-19.yang   -a
sysrepoctl --install  iana-routing-types@2018-10-29.yang   -a

sysrepoctl --install ietf-ip@2018-02-22.yang -a
sysrepoctl --install ietf-yang-schema-mount@2019-01-14.yang -a
sysrepoctl --install ietf-network-instance@2019-01-21.yang -a
sysrepoctl --install ietf-restconf@2017-01-26.yang -a

sysrepoctl --install  ietf-subscribed-notifications@2019-09-09.yang -a 
