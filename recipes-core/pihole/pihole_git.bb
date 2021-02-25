DESCRIPTION = "Installation and configuration of pihole recipe"
SECTION = "pihole"
LICENSE = "MIT"
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/pi-hole/pi-hole.git"

S = "${WORKDIR}"

do_install() {
    echo ${ls -la} 
    echo ${pwd}
}