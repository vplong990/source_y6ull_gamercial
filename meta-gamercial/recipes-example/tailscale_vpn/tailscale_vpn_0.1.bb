DESCRIPTION = "Copy a file to usr/bin and make the symbolic link"
LICENSE = "CLOSED"

SRC_URI = "file://tailscale.combined"

do_install() {
    install -d ${D}/usr/bin
    install -m 0644 ${WORKDIR}/tailscale.combined ${D}/usr/bin
    
    lnr ${D}/usr/lib/tailscale.combined ${D}/usr/lib/tailscale
    lnr ${D}/usr/lib/tailscale.combined ${D}/usr/lib/tailscaled
}

FILES_${PN} += "/usr/bin/tailscale.combined"
