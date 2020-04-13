LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
S = "${WORKDIR}"

SRC_URI += "file://hello-world-cpp-makefile.tar.gz"

do_install() {
    # Install binary to usr/bin
    oe_runmake install 'DESTDIR=${D}'
}