package cn.itcast.day04_常用api第一部分.Demo_08_Math类;

public class Demo01Math {
    public static void main(String[] args) {
        double a = -0.25;
        System.out.println(Math.abs(a));

       double b = 9.1;
        System.out.println(Math.ceil(b));  //10.0

        double c = 9.8;
        System.out.println(Math.floor(c)); //9.0

        double d = 9.7;
        System.out.println(Math.round(d));  //10
    }
}
