package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

import java.util.ArrayList;

public class Demo04ArrayListEach_遍历 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("赵丽颖");
        List.add("迪丽热巴");
        List.add("古力娜扎");
        List.add("赵又廷");
        System.out.println(List);

        //利用for循环，进行遍历
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}
