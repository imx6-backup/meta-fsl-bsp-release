# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=acdb807ac7275fe32f9f64992e111241"

PE="1"

SRC_URI[md5sum] = "6e700f3d3a6482db08d5aabee7751630"
SRC_URI[sha256sum] = "1f09acd4d605efc78a0672068a658cb16274811d2f444cf3ae7aaa075266746f"

COMPATIBLE_MACHINE = "(mx5|mx6)"
