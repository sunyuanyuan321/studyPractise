package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����.��ϰ;

import java.util.ArrayList;

public class C_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("����ɽ");
        list.add("ë��");
        list.add("����ʯ");
        System.out.println(list);

        listA sc = new listA();
        sc.printArrayList(list);


    }
}
