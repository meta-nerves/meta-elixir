# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

inherit nativesdk

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c48e31d655fb0e9b1f60b931e652f47"

#SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https"
SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https;branch=v1.3"

# Modify these as desired
#PV = "1.3.0-dev+git${SRCPV}"
#SRCREV = "${AUTOREV}"
PV = "1.3.3"
SRCREV = "87da507c2428c0aef0917a043be0530d15663046"

S = "${WORKDIR}/git"

#erlang-compiler for iex
RDEPENDS_${PN} += " nativesdk-erlang"

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install PREFIX=${D}${prefix}
}
