build: `bitbake core-image-olehk -c build`

flash: `sudo dd if=core-image-olehk-raspberrypi3-olehk.rpi-sdimg of=/dev/mmcblk0 bs=1M conv=fsync`

devshell: `bitbake core-image-olehk -c devshell`

create recipe with recipetool:

`recipetool create -o hello-world-cpp-cmake.bb -V 1.00 https://github.com/definename/hello-world-cpp-cmake.git`
