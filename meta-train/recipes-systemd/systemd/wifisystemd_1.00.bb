LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "wifi.service"

SRC_URI_append = " file://wifi.service "
FILES_${PN} += "${systemd_unitdir}/system/wifi.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/wifi.service ${D}/${systemd_unitdir}/system
}
