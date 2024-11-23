HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse

UBOOT_SRC ?= "git://github.com/vplong990/uboot_y6ull_gamercial.git;protocol=https"
SRCBRANCH = "main"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
"
SRCREV = "${AUTOREV}"

#UBOOT_SRC = "git:///home/gamercial/MYD-Y6ULX-devel/04_Sources/myir-imx-uboot;protocol=file"
#SRCBRANCH = "develop_2020.04"
#SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
#"
#SRC_URI_append = " file://splash.bmp"
#SRCREV = "25276d37405151d3f77a900c74f0e19934e8d4aa"



S = "${WORKDIR}/git"
