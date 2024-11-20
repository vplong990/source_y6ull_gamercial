SUMMARY = "Meig-CM for SML750"
LICENSE = "CLOSED"

S_BRANCH ?= "main"
S_SRC ?= "git://github.com/vplong990/meig-cm.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

SRC_URI = "${S_SRC};branch=${S_BRANCH} \
"

do_compile (){
  make 
}

do_install () {
    install -d ${D}${bindir}

    install -m 0755 ${S}/Meig-CM ${D}${bindir}
}

FILES_${PN} += "${bindir}"

INSANE_SKIP_${PN}-dev = "ldflags"
INSANE_SKIP_${PN} = "${ERROR_QA} ${WARN_QA}"
