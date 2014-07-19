LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := gl
FILES += gl.cpp
FILES += util.cpp
LOCAL_SRC_FILES := $(FILES)
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -llog 

include $(BUILD_SHARED_LIBRARY)
