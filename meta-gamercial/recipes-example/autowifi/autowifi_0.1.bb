DESCRIPTION = "Copy a file to the home directory"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://auto-wifi.sh"

do_install() {
    install -d ${D}/home/root
    install -m 0644 ${WORKDIR}/auto-wifi.sh ${D}/home/root
}

FILES_${PN} += "/home/root/auto-wifi.sh"
