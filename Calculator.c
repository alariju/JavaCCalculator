#include <jni.h>
#include <stdio.h>
#include "Calculator.h"

/*
	Función ADDNUMBERS
		Esta función recibe dos números enteros
		y retorna la suma de ellos.
*/
JNIEXPORT jint JNICALL Java_Calculator_ADDNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x+y;
}

/*
	Función SUBNUMBERS
		Esta función recibe dos números enteros
		y retorna la resta de ellos.
*/
JNIEXPORT jint JNICALL Java_Calculator_SUBNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x-y;
}

/*
	Función MULNUMBERS
		Esta función recibe dos números enteros
		y retorna la multiplicación de ellos.
*/
JNIEXPORT jint JNICALL Java_Calculator_MULNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x*y;
}

/*
	Función DIVNUMBERS
		Esta función recibe dos números enteros
		y retorna la división de ellos.
*/
JNIEXPORT jint JNICALL Java_Calculator_DIVNUMBERS(JNIEnv *env, jobject jobj, jint x, jint y){
	return x/y;
}
