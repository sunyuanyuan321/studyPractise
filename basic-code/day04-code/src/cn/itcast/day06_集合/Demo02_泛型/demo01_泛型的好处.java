package cn.itcast.day06_集合.Demo02_泛型;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01_泛型的好处 {
    public static void main(String[] args) {
        //不使用泛型
        ArrayList list = new ArrayList();
        list.add("abc");  //继承的是object类，所有的数据类型
        list.add(3);
        System.out.println(list);

        //利用迭代器遍历
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

            //如果使用String子类特有的方法，例如length方法，需要向下转型，int类型无法向下转型，报错
            String s =(String)it.next();  //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            System.out.println(s);
        }
    }
}
