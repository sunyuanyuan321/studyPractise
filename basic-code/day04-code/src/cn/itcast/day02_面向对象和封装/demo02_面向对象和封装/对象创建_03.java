package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
1、导包：指出需要使用的类，在什么位置
import 包名.类名
import java.util.Arrays;
import cn.itcast.day04.Student
2、创建，格式：
类名称  对象名  = new 类名称（）；
 */
public class 对象创建_03 {
    public static void main(String[] args) {
        //1、导包，使用Student类，和本demo02 在同一个包下面，可以省略不写
        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.name = "王刚";
        stu.age = 55;
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
