package cn.itcast.day04_常用api第一部分.Demo_03_Random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt();
        //随机数是正负 int 整数范围
        System.out.println("这个随机数是：" + num);

    }
}
