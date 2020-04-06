# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# Install i2c-tools
IMAGE_INSTALL_append = " i2c-tools"

# Install vim
IMAGE_INSTALL_append = " vim"
