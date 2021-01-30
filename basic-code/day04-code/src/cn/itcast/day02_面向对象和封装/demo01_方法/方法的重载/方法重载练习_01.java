package cn.itcast.day02_面向对象和封装.demo01_方法.方法的重载;

public class 方法重载练习_01 {
    public static void main(String[] args) {

        System.out.println(isSame((byte) 10, (byte) 20));
        System.out.println(isSame2((byte) 22, (byte) 22));
        System.out.println(isSame((short) 10, (short) 10));
        System.out.println(isSame(11,22));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数方法");
        return a == b;
    }

    public static boolean isSame2(byte a, byte b) {
        System.out.println("两个byte参数方法2");
        boolean c = a == b ? true : false;
        return c;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数方法");
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数方法");
        return a == b;
    }
}
