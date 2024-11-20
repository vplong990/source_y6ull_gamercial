SUMMARY = "gobinet driver"
LICENSE = "CLOSED"

S_BRANCH ?= "main"
S_SRC ?= "git://github.com/vplong990/gobinet_driver_v1.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

SRC_URI = "${S_SRC};branch=${S_BRANCH} \
"

do_compile (){
  make 
}

FILES_${PN} += "${bindir}"

INSANE_SKIP_${PN}-dev = "ldflags"
INSANE_SKIP_${PN} = "${ERROR_QA} ${WARN_QA}"
