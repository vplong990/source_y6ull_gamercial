SUMMARY = "MeiG-CM file for SML-750"
LICENSE = "CLOSED"

SRC_URI = "files://Makefile \
	        files://main.c \
"

do_compile (){
  make 
}

do_install () {
    install -d ${D}${bindir}

    install -m 0755 ${S}/quectel-CM ${D}${bindir}
}

FILES_${PN} += "${bindir}"

INSANE_SKIP_${PN}-dev = "ldflags"
INSANE_SKIP_${PN} = "${ERROR_QA} ${WARN_QA}"
