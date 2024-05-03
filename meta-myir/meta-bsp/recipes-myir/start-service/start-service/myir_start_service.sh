#!/bin/sh
echo "start service" > /var/startservice.log
#resize2fs /dev/mmcblock2p2

export XDG_RUNTIME_DIR=/run/user/0
export QT_QPA_PLATFORM=wayland

/home/root/auto-wifi.sh &

exit 0
