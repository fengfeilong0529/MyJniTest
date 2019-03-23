//
// Created by Administrator on 2019/3/23.
//

#include <com_feilong_myjnitest_MainActivity.h>

jstring Java_com_feilong_myjnitest_MainActivity_getHelloWorldString(JNIEnv* env,jobject obj){

return (*(*env)).NewStringUTF(env, "I'm Hello World From C");
}


jstring Java_com_feilong_myjnitest_MainActivity_getHelloCoderString(JNIEnv* env,jobject obj){
return (*(*env)).NewStringUTF(env, "I'm Hello Coder From C");
}

