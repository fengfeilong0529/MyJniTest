LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

#编译生成的so文件名
LOCAL_MODULE := helloworld
#要编译的c文件
LOCAL_SRC_FILES := helloworld.c

include $(BUILD_SHARED_LIBRARY)
