package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����;

import java.util.ArrayList;

public class Demo04ArrayListEach_���� {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("����ӱ");
        List.add("�����Ȱ�");
        List.add("��������");
        List.add("����͢");
        System.out.println(List);

        //����forѭ�������б���
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}
