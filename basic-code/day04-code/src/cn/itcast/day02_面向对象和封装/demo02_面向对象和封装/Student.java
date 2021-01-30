package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

/*
定义一个类，用来模拟学生
属性：  姓名，年龄
行为： 吃饭，睡觉，学习

对应到java的类中
成员变量：属性
String name；
int age；
成员方法：行为
public void eat（）{}；

注意事项：
1、成员变量是直接定义在类中，方法的外边；
2、成员方法不要写static关键字
 */
public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }


}
