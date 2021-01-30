package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合.练习;

import java.util.ArrayList;

public class C_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("孙中山");
        list.add("毛泽东");
        list.add("蒋介石");
        System.out.println(list);

        listA sc = new listA();
        sc.printArrayList(list);


    }
}
