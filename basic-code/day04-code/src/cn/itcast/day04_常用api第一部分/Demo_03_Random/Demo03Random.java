package cn.itcast.day04_常用api第一部分.Demo_03_Random;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();

        //随机数范围自定义取值：随机数 范围 [1-5]
        for (int i = 0; i < 10; i++) {   //10.fori  快捷键
            int num = r.nextInt(5) + 1;
            System.out.println("随机数是：：" + num);

        }
    }
}
