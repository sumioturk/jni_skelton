#include <jni.h>
#include <android/log.h>
#include <gl.h>
#include <android-util.h>


JNIEXPORT void JNICALL Java_com_example_gl_GL_log(JNIEnv* env, jobject obj){
	LOGW("AAA", "LOGW!!");
};


