LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := gl
FILES += gl.cpp
FILES += util.cpp
FILES += renderer.cpp
FILES += jniapi.cpp
LOCAL_SRC_FILES := $(FILES)
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog -landroid -lEGL -lGLESv1_CM 

include $(BUILD_SHARED_LIBRARY)
