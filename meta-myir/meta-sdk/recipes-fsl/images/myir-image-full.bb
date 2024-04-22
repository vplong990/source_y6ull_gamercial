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
OPENCV_PKGS       ?= ""
OPENCV_PKGS_imxgpu = " \
    opencv-apps \
    opencv-samples \
    python3-opencv \
"

IMAGE_INSTALL += " \
    ${OPENCV_PKGS} \
    ${ML_PKGS} \
    python3 \
    start-service \
    ppp-quectel \
    libgpiod \
    libgpiod-tools \
    firmware-brcm43362 \
    can-utils \
    sqlite3 \
    u-boot-fw-utils \
    quectel-cm \
    iperf3 \
    proftpd \
    packagegroup-imx-core-tools \
    qtsvg \
    qtvirtualkeyboard \
    qtmultimedia \
    qtquickcontrols2 \
    qtquickcontrols \
    qtmqtt \
    wireguard-tools \
    libusb1 \
    v4l-utils \
    alsa-utils \
    cups \
    openssh-sftp \
    openssh-sftp-server \
"

IMAGE_INSTALL_append = " autowifi"


#TOOLCHAIN_TARGET_TASK += " \
#    ${ML_STATICDEV} \
#"

#tslib 
#tslib-calibrate 
#tslib-conf 
#tslib-tests
#myir-linux-examples \
#qt-demo
