package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合.练习;

import java.util.ArrayList;

public class listA {
    // {10@20@30}
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }

    }
}


