package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����.��ϰ;

import java.util.ArrayList;
import java.util.Random;

public class D_04ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add(r.nextInt(100));
        }

        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                B.add(list.get(i));
            }
        }

        System.out.println(list);
        System.out.println(B);
    }

}
