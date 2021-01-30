package cn.itcast.day06_����.Demo01_Collection����;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class demo01_Collection���ϸ��� {
    public static void main(String[] args) {
        //����Array �� ArrayList ����
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(a);  //[I@1540e19d
        System.out.println(Arrays.toString(a));  //[1, 2, 3, 4, 5, 6]

        Integer[] a2 = {5, 4, 3, 2, 1};
        System.out.println(a2);  //@677327b6
        System.out.println(Arrays.toString(a2));  //[5, 4, 3, 2, 1]

        char[] b = {'a', 'b', 'c'};  //�ַ���
        System.out.println(b);  //abc
        System.out.println(Arrays.toString(b));  //[a, b, c]

        String[] c = {"a", "b", "c"};
        System.out.println(c);  //[Ljava.lang.String;@677327b6
        System.out.println(Arrays.toString(c));  //[a, b, c]

        System.out.println("----------------");

        //����
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
