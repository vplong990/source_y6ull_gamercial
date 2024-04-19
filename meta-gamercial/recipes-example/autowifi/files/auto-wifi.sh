#!/bin/sh

#create new files in systemd
echo "[Match]" > /lib/systemd/network/10-wireless.network 
echo "Name=wlan0" >> /lib/systemd/network/10-wireless.network
echo "[Network]" >> /lib/systemd/network/10-wireless.network 
echo "DHCP=ipv4" >> /lib/systemd/network/10-wireless.network

#create file wlan0
mkdir -p /etc/wpa_supplicant/
echo "ctrl_interface=/var/run/wpa_supplicant" > /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
echo "eapol_version=1" >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
echo "ap_scan=1" >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
echo "fast_reauth=1" >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
echo " " >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf 
#wpa_passphrase "Nano Pham Ecosystem 01" "0987949494" >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
wpa_passphrase "Gamercial" "G@m3rc1al" >> /etc/wpa_supplicant/wpa_supplicant-wlan0.conf

#enable wlan0 service
systemctl enable wpa_supplicant@wlan0.service
sleep 5
systemctl restart wpa_supplicant@wlan0.service
sleep 5
systemctl restart systemd-networkd.service

exit 0
