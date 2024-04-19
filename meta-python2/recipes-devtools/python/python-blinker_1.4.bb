SUMMARY = "Fast, simple object-to-object and broadcast signaling."
DESCRIPTION = "Blinker provides a fast dispatching system that allows any \
number of interested parties to subscribe to events, or 'signals'.\
\
Signal receivers can subscribe to specific senders or receive signals sent by \
any sender."
HOMEPAGE = "https://pythonhosted.org/blinker/"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=946d7e89af6f7733aeaebed5635d2682"

SRC_URI[md5sum] = "8b3722381f83c2813c52de3016b68d33"
SRC_URI[sha256sum] = "471aee25f3992bd325afa3772f1063dbdbbca947a041b8b89466dc00d606f8b6"

inherit pypi setuptools
