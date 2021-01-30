package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合.练习;

import java.util.ArrayList;
import java.util.Random;

public class num {

//    ArrayList<Integer> list = new ArrayList<>();
//    ArrayList<Integer> B = new ArrayList<>();

    public void ran(int a, int b) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(r.nextInt(b) + 1);

        }
        for (int i = 0; i < a; i++) {
            if (list.get(i) % 2 == 0) {
                B.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(B);
    }
}
//    public void sr(ArrayList<Integer> b){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) %2==0){
//                b.add(list.get(i));
//            }
//        }
//        System.out.println(list);
//        System.out.println(b);
//    }
//}
