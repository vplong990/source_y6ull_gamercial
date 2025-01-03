DESCRIPTION = "Copy a file to usr/bin and make the symbolic link"
LICENSE = "CLOSED"
#${D} is /usr and ${bindir} is bin

SRC_URI = "file://tailscale.combined"

do_install() {
    install -d ${D}${bindir}
    install -m 0644 ${WORKDIR}/tailscale.combined ${D}${bindir}
    
    cd ${D}/usr/bin
    ln -s /usr/bin/tailscale.combined tailscale
    ln -s /usr/bin/tailscale.combined tailscaled
    
}

FILES_${PN} += "/usr/bin/tailscale.combined"
