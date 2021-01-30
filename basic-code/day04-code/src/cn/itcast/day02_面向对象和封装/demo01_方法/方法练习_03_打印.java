package cn.itcast.day02_面向对象和封装.demo01_方法;

public class 方法练习_03_打印 {
    public static void main(String[] args) {
        printCout(5);
    }

    public static void printCout(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + "   " + "HelloWorld");  //打印HelloWord的次数
        }
    }
}
