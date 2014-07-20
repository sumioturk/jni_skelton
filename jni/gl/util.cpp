#include <jni.h>
#include <android-util.h>
#include <android/log.h>

JNIEXPORT void JNICALL Java_com_example_gl_Util_log(JNIEnv* env, jobject obj){
	LOGE("BBB", "LOGE");
}
