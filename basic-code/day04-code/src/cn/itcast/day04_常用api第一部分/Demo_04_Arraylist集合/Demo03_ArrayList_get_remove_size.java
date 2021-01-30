package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

import java.util.ArrayList;

public class Demo03_ArrayList_get_remove_size {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("赵丽颖");
        List.add("迪丽热巴");
        List.add("古力娜扎");
        List.add("赵又廷");

        boolean Success = List.add("王宝强");
        System.out.println("加入boolean来判断是否加添成功：   " + Success);  //true
        System.out.println(List);

        //读取元素
        String name = List.get(2);
        System.out.println(name);   //古力娜扎
        //删除元素
        List.remove(4);
        System.out.println(List);   //王宝强 被删除了
        //元素长度
        int a = List.size();
        System.out.println("该集合的长度为：  " +a);
    }
}
