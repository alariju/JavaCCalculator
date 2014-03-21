#include <jni.h>
#include <stdio.h>
#include "Calculator.h"

JNIEXPORT jint JNICALL Java_Calculator_ADDNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x+y;
}

JNIEXPORT jint JNICALL Java_Calculator_SUBNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x-y;
}

JNIEXPORT jint JNICALL Java_Calculator_MULNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x*y;
}

JNIEXPORT jint JNICALL Java_Calculator_DIVNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x/y;
}
