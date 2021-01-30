package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

import java.util.ArrayList;

public class Demo02Array_add {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<String> List = new ArrayList<>();
        System.out.println(List);  //[]

        //向集合中添加一些数据
        List.add("赵丽颖");
        List.add("迪丽热巴");
        List.add("古力娜扎");
        List.add("赵又廷");
        System.out.println(List);  //[赵丽颖, 迪丽热巴, 古力娜扎, 赵又廷]

    }
}
