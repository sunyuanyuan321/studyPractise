package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

public class 一个标准的类_08 {
    public static void main(String[] args) {
        //调用无参数方法
        students stu1 = new students();
        //  System.out.println(stu1.getName());  //默认是 null

        //调用有参数方法，创建对象，并且赋值
        students stu2 = new students("赵丽颖", 28);
        System.out.println(stu2.getName());

        //调用sayHello方法
        stu2.sayHello("小明");
        stu1.sayHello("小明"); //没有赋值 小明是null的同学
    }


}
