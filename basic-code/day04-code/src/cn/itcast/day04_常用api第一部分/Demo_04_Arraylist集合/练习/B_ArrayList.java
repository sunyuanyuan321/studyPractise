package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����.��ϰ;

import java.util.ArrayList;

public class B_ArrayList {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();

        student a = new student("����",12);
        student b = new student("����",14);
        student c = new student("����",11);
        student d = new student("����",12);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        list.add(new student("����",45));
        list.add(new student("����",38));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"   "+list.get(i).getAge());
        }

    }
}
