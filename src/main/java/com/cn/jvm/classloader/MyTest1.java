package com.cn.jvm.classloader;


public class                               MyTest1 {
    public static void main(String[] args) {
        /*对于静态字段来说，只有直接定义了该字段的类才会被初始化
            当一个类在初始化时，要求其父类全部都已经完成了初始化
         */
        //为什么子类的静态代码块没有执行
        System.out.println(MyChild1.str);

       // System.out.println(MyChild1.str2);
    }
}
class MyParent1
{
 static String str = "Hello World";
    static{
        System.out.println("MyParent1 static block");
    }
}
class MyChild1 extends MyParent1
{
    public static String str2 = "Wellcome";
    static {
        System.out.println("MyChild1 static block");
    }

}
