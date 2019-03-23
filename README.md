# MyJniTest

## 步骤：
### 1、在某一需要的类中，定义native方法
### 2、然后用javah快捷方式生成对应的.h文件，路径在src/main/jni中
### 3、在jni文件夹中定义.c文件，实现.h中的方法
### 4、在module的build.gradle文件中加入一下代码，点击sync
### 5、用ndk-build快捷方式生成对应的so文件
### 6、最后，在需要的类中调用native方法即可
---
### 参考：
- https://www.cnblogs.com/rocomp/p/4892866.html
- https://www.cnblogs.com/ut2016-progam/p/6066855.html
