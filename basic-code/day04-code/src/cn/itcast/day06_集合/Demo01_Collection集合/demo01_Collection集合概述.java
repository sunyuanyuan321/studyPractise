package cn.itcast.day06_集合.Demo01_Collection集合;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class demo01_Collection集合概述 {
    public static void main(String[] args) {
        //数组Array 和 ArrayList 区别
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(a);  //[I@1540e19d
        System.out.println(Arrays.toString(a));  //[1, 2, 3, 4, 5, 6]

        Integer[] a2 = {5, 4, 3, 2, 1};
        System.out.println(a2);  //@677327b6
        System.out.println(Arrays.toString(a2));  //[5, 4, 3, 2, 1]

        char[] b = {'a', 'b', 'c'};  //字符型
        System.out.println(b);  //abc
        System.out.println(Arrays.toString(b));  //[a, b, c]

        String[] c = {"a", "b", "c"};
        System.out.println(c);  //[Ljava.lang.String;@677327b6
        System.out.println(Arrays.toString(c));  //[a, b, c]

        System.out.println("----------------");

        //集合
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        System.out.println(list1); //[1, 3]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("s");
        list2.add("b");
        System.out.println(list2);  //[s, b]
    }
}
