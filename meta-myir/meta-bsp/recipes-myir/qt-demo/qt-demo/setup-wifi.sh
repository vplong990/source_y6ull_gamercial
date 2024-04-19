#!/bin/sh

ifconfig wlan0 192.168.1.90   #Set the static IP address, should be unique
wpa_passphrase TP-Link_Dual 4060485vpL> /etc/wpa_supplicant.conf
route add default gw 192.168.1.1  #Router IP address
wpa_supplicant -B -i   wlan0    -c    /etc/wpa_supplicant.conf
echo “nameserver 8.8.8.8” >> /etc/resolv.conf
echo “nameserver 8.8.4.4” >> /etc/resolv.conf
: exit 0

