package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合.练习;

import java.util.ArrayList;
import java.util.Random;

public class A_01Random {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
