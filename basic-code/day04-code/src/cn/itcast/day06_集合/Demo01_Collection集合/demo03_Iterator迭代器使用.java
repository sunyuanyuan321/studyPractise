package cn.itcast.day06_集合.Demo01_Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo03_Iterator迭代器使用 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("wanger");
        System.out.println(coll);  //[张三, 李四]

        //1、创建迭代器
        Iterator<String> it1 = coll.iterator();
        System.out.println(it1);  //java.util.ArrayList$Itr@1540e19d

        //2、用while循环，判断、获取元素
        while (it1.hasNext()) {  //it1.hasNext() == true
            System.out.println("while循环输出这个元素:" + it1.next());
        }

        System.out.println("==============");

        //3、for循环
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            System.out.println("for循环输出这个元素:" + it2.next());
        }

        System.out.println("-----------");
        //增强for循环
        for (String s :coll){
            System.out.println(s);
        }

        System.out.println("______________");

        //增强for循环,也可以遍历数组
        int [] in ={1,2,3,4,5};
        for (int i :in){
            System.out.println(i);
        }

//        System.out.println("===========");
//        System.out.println( "使用hasNaxt(),方法判断是否还有元素："+it1.hasNext());
//        System.out.println("输出这个元素"+it1.next());
//
//        System.out.println( "使用hasNaxt(),方法判断是否还有元素："+it1.hasNext());
        //System.out.println("输出这个元素"+it1.next());
    }
}
