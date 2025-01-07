DESCRIPTION = "Copy a file to the home directory"
LICENSE = "CLOSED"

SRC_URI = "file://rs485_test.py"

do_install() {
    install -d ${D}/home/root
    install -m 0777 ${WORKDIR}/rs485_test.py ${D}/home/root
}

FILES_${PN} += "/home/root/rs485_test.py"
