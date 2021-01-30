package cn.itcast.day05_常用API第二部分.Demo_04_Sysrem类;

public class 练习 {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(s1);
        int a = 1;
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);;
        }
        System.out.println(a);
        long s2 = System.currentTimeMillis();
        System.out.println(s2);
        long runTime = s2 - s1;
        System.out.println(runTime);
    }
}
