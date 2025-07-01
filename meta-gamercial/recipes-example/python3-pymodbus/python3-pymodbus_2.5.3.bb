SUMMARY = "A fully featured modbus protocol stack in python"
HOMEPAGE = "https://github.com/riptideio/pymodbus/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c2223d66c7e674b40527b5a4c35bd76"

SRC_URI = "https://files.pythonhosted.org/packages/fe/a9/f98aadfcb8d0a34326be68a06a72cc60e04139e8f4fd17633972f8af3b4c/pymodbus-2.5.3.tar.gz"
SRC_URI[md5sum] = "28e8ac7f84adace83319d3733e00dee8"
SRC_URI[sha256sum] = "5ef68c1a109bdb467c830ef003ef2db6494349a5248e4af946fe21c9eefe7e74"

S = "${WORKDIR}/pymodbus-2.5.3"

inherit setuptools3

DEPENDS += "${PYTHON_PN}-six-native"
RDEPENDS_${PN} = "${PYTHON_PN}-six ${PYTHON_PN}-pyserial"
