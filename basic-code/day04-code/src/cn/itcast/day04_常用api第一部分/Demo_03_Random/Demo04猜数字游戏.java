package cn.itcast.day04_常用api第一部分.Demo_03_Random;

import java.util.Random;
import java.util.Scanner;

public class Demo04猜数字游戏 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);

        System.out.println("答案提示：" + num);

        Scanner t = new Scanner(System.in);
        System.out.println("请输入一个数！");
        int a = t.nextInt();
        int n = 1;
        int m = 1;

        while (num != a) {
            if (a > num) {
                System.out.println("你猜错了，这个数比 " + a + " 小，请再输入一个数！");
            } else {
                System.out.println("你猜错了，这个数比 " + a + " 大，请再输入一个数！");

            }
            n = n + 1;
            a = t.nextInt();
        }
        System.out.println("N终于猜对了，一个用了 " + n + "  次");
        System.out.println("========================");
        System.out.println("请M输入一个数：");
        int b = t.nextInt();
        while (num != b) {
            if (b> num) {
                System.out.println("你猜错了，这个数比 " + b + " 小，请再输入一个数！");
            } else {
                System.out.println("你猜错了，这个数比 " + b + " 大，请再输入一个数！");

            }
            m = m + 1;
            b = t.nextInt();
        }
        System.out.println("M终于猜对了，一个用了 " + m + "  次");

        if (n > m) {
            System.out.println(" N你猜的次数多，你喝酒！");
        }
        if (n == m) {
            System.out.println("猜的次数一样多，再来一次");
        }
        else{
            System.out.println( " M你猜的次数多，你喝酒！");
        }
    }

}
