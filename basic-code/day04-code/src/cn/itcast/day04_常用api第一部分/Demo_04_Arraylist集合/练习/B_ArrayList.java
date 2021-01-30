package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合.练习;

import java.util.ArrayList;

public class B_ArrayList {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();

        student a = new student("张三",12);
        student b = new student("李四",14);
        student c = new student("王二",11);
        student d = new student("麻子",12);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        list.add(new student("孙文",45));
        list.add(new student("刘邦",38));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"   "+list.get(i).getAge());
        }

    }
}
