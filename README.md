build: `bitbake core-image-olehk -c build`

flash: `sudo dd if=core-image-olehk-raspberrypi3-olehk.rpi-sdimg of=/dev/mmcblk0 bs=1M conv=fsync`

devshell: `bitbake core-image-olehk -c devshell`
