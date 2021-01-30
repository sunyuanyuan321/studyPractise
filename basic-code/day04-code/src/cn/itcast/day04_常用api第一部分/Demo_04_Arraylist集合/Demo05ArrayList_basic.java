package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

import java.util.ArrayList;

public class Demo05ArrayList_basic {
    public static void main(String[] args) {
        //ArrayList 泛型 不能存放 基本数据类型，需要包装类
        //ArrayList<int> list = new ArrayList<>();   //会提示报错，更改成 Integer

        ArrayList<Integer> ListA = new ArrayList<>();
        ListA.add(100);
        ListA.add(200);
        ListA.add(300);
        System.out.println(ListA);
        //读取元素
        System.out.println(ListA.get(1));

        int num = ListA.get(2);
        System.out.println(num);
    }
}
