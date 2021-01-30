package cn.itcast.day06_集合.Demo03_;

import java.util.ArrayList;

public class demo01_doudi {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"?", "?", "?", "?"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        poker.add("????");
        poker.add("???");
        //???????
        for (String color : colors) {
            for (String number : numbers) {
                System.out.println(color + number);
            }

        }
    }
}
