package cn.itcast.day04_常用api第一部分.Demo_03_Random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {

        Random r = new Random();
        //int num = r.nextInt(5);
        //打印数字 范围是 左开右闭 [0-5)
        for (int i = 0; i < 10; i++) {

            int num = r.nextInt(5);
            System.out.println("随机数是：" + num);

        }

    }


}
