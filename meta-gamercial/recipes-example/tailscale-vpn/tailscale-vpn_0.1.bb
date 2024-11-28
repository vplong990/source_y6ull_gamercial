DESCRIPTION = "Copy a file to usr/bin and make the symbolic link"
LICENSE = "CLOSED"

SRC_URI = "file://tailscale.combined"

do_install() {
    install -d ${D}/usr/bin
    install -m 0644 ${WORKDIR}/tailscale.combined ${D}/usr/bin
    
    cd ${D}/usr/bin
    ln -s /usr/bin/tailscale.combined tailscale
    ln -s /usr/bin/tailscale.combined tailscaled
}

FILES_${PN} += "/usr/bin/tailscale.combined"
