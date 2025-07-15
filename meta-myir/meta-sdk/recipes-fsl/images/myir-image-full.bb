# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-fsl/images/imx-image-multimedia-nand.bb

inherit populate_sdk_qt5

CONFLICT_DISTRO_FEATURES = "directfb"
# Add machine learning for certain SoCs
ML_PKGS                   ?= ""
ML_STATICDEV              ?= ""
ML_PKGS_mx8                = "packagegroup-imx-ml"
ML_PKGS_mx8dxl             = ""
ML_STATICDEV_mx8dxl        = ""
ML_PKGS_mx8phantomdxl      = ""
ML_STATICDEV_mx8phantomdxl = ""
ML_PKGS_mx8mnlite          = ""
ML_STATICDEV_mx8mnlite     = ""

# Add opencv for i.MX GPU
#OPENCV_PKGS       ?= ""
#OPENCV_PKGS_imxgpu = " \
#    opencv-apps \
#    opencv-samples \
#    python3-opencv \
#"

IMAGE_INSTALL += " \        
    python3 \
    start-service \    
    libgpiod \
    libgpiod-tools \
    firmware-brcm43362 \
    can-utils \
    sqlite3 \
    u-boot-fw-utils \
    iperf3 \
    proftpd \
    packagegroup-imx-core-tools \
    qtsvg \    
    qtquickcontrols2 \
    qtquickcontrols \
    qtmqtt \
    qtserialport \
    wireguard-tools \    
    v4l-utils \
    alsa-utils \   
    openssh-sftp \
    openssh-sftp-server \
    networkmanager \
    networkmanager-nmtui \
    networkmanager-nmcli \
    libmodbus \   
    android-tools \  
    python3-pip \
    python-pyserial \  
    python3-paho-mqtt \   
    python3-smbus2 \
    python3-pymodbus \
"

IMAGE_INSTALL_append = " tailscale-vpn sml750"

#Option packages
#rs485-test

#TOOLCHAIN_TARGET_TASK += " \
#    ${ML_STATICDEV} \
#"
#-----package-removes--------
#${ML_PKGS} \
#${OPENCV_PKGS} \
#tslib 
#tslib-calibrate 
#tslib-conf 
#tslib-tests
#myir-linux-examples \
#qt-demo
#qtvirtualkeyboard \
#qtmultimedia \
#modemmanager \
#networkmanager-nmtui \
#networkmanager-bash-completion \
#networkmanager-nmcli \
#networkmanager \
#curl \
#util-linux-libuuid \
#cups \ 
#libusb1 \
#tailscale-vpn \
#ffmpeg \
#-----4G packages-------
#ppp-quectel \
#quectel-cm \
#libqmi \
#ppp \
#htop \
#sml750 \
#-----python packages-------
#python-pyserial 
#python3-smbus2
#python3-pymodbus
#python-smbus
#python3-smbus
#python-pip  
#-----C packages-------
#libmodbus

