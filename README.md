# MyJniTest

## 步骤：
### 1、在某一需要的类中，定义native方法
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/1.png)
### 2、然后用javah快捷方式生成对应的.h文件，路径在src/main/jni中
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/2.png) 
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/3.png)
### 3、在jni文件夹中定义.c文件，实现.h中的方法
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/4.png)
### 4、在module的build.gradle文件中加入一下代码，点击sync
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/5.png)
### 5、用ndk-build快捷方式生成对应的so文件，路径在src/main/lib或src/main/obj中
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/51.png)
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/6.png)
### 6、最后，在需要的类中调用native方法即可
![](https://github.com/fengfeilong0529/MyJniTest/blob/master/jni_pics/7.png)
---
### External Tools配置（Settings -> Tools -> External Tools）：
- javah：
   - Program：$JDKPath$\bin\javah.exe
   - Arguments：-classpath . -jni -d $ModuleFileDir$/src/main/jni $FileClass$
   - Working directory：$ModuleFileDir$\src\main\Java
- ndk-build：
   - Program：D:\Android_NDK\android-ndk-r11b\ndk-build.cmd 
   - Working directory：$ProjectFileDir$\app\src\main 
---
### 参考：
- https://www.cnblogs.com/rocomp/p/4892866.html
- https://www.cnblogs.com/ut2016-progam/p/6066855.html
