package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����;

import java.util.ArrayList;

public class Demo02Array_add {
    public static void main(String[] args) {
        //����һ��ArrayList����
        ArrayList<String> List = new ArrayList<>();
        System.out.println(List);  //[]

        //�򼯺������һЩ����
        List.add("����ӱ");
        List.add("�����Ȱ�");
        List.add("��������");
        List.add("����͢");
        System.out.println(List);  //[����ӱ, �����Ȱ�, ��������, ����͢]

    }
}
