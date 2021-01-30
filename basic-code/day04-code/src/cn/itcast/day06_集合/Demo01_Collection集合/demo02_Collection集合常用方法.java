package cn.itcast.day06_集合.Demo01_Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class demo02_Collection集合常用方法 {
    public static void main(String[] args) {
        //增、删、清除、判断
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        System.out.println(coll);  //[Hello, World]

        boolean result = coll.remove("World");
        System.out.println(result);  //true
        System.out.println(coll);   //[Hello]

        //清空
        coll.clear();
        System.out.println(coll);  //[] 清空了
        System.out.println("判断是否空集合：" + coll.isEmpty());

        coll.add("Hello");
        coll.add("World");
        System.out.println(coll.size());  //2
        System.out.println(coll.contains("Hello"));  //true

        // 集合对象 转换数组
        Object[] array1 = coll.toArray();
        System.out.println(array1.length);
        System.out.println(array1);  //打印内存地址值，[Ljava.lang.Object;@1540e19d
        for (int i = 0; i < array1.length; i++) {
            System.out.println("第" + (i + 1) + "个数组是：" + array1[i]);
            if (i == array1.length-1) {
                System.out.println("一共有："+(i + 1)+"个数组元素");
            }
        }
    }
}
