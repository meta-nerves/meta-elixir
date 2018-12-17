# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

inherit nativesdk

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea2fae57734e78cb8a5ac8244ed8ebdc"

#SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https"
SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https;branch=v1.7"

# Modify these as desired
#PV = "1.3.0-dev+git${SRCPV}"
#SRCREV = "${AUTOREV}"
PV = "1.7.4"
SRCREV = "eb5679bfcc9bd35c4c016e91745b4a1a4d43356a"

S = "${WORKDIR}/git"

#erlang-compiler for iex
DEPENDS += "erlang-native ncurses-native openssl-native"
RDEPENDS_${PN} += " nativesdk-erlang"

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install PREFIX=${D}${prefix}
}
