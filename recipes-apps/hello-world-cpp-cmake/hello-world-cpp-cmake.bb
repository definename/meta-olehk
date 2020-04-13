# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/definename/hello-world-cpp-cmake.git;protocol=https"

# Modify these as desired
PV = "1.00+git${SRCPV}"
SRCREV = "bace13ac20c313237fff6b7142290bc622786208"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install() {
    # Install binary to usr/bin
    install -d "${D}${bindir}"
    install -m 0755 hello-world-cpp-cmake "${D}${bindir}"
}

