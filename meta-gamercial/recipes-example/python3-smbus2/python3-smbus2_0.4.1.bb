SUMMARY = "Python SMBus binding for Linux"
DESCRIPTION = "This Python module allows SMBus access through the I2C /dev interface on Linux hosts."
HOMEPAGE = "https://github.com/kplindegaard/smbus2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38f6e25f5cd3d49e5313fd4c662a58c2"

SRC_URI = "https://files.pythonhosted.org/packages/52/00/335f4e9833eb1a5263b50f4a4cf0b99f7586b46c6df517d836cd30406b36/smbus2-0.4.1.tar.gz"
SRC_URI[md5sum] = "c3e7e9e3a7a1e7f0a9e5f2e9e6e9f4f"
SRC_URI[sha256sum] = "e6b3b7a3b4b6e040bd14bc693d5e1193b5765f21f2f0b2d6feca6cb2f5c7e2c2"

S = "${WORKDIR}/smbus2-0.4.1"

inherit setuptools3

RDEPENDS_${PN} = "python3-core"
