package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����;

import java.util.ArrayList;

public class Demo03_ArrayList_get_remove_size {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("����ӱ");
        List.add("�����Ȱ�");
        List.add("��������");
        List.add("����͢");

        boolean Success = List.add("����ǿ");
        System.out.println("����boolean���ж��Ƿ����ɹ���   " + Success);  //true
        System.out.println(List);

        //��ȡԪ��
        String name = List.get(2);
        System.out.println(name);   //��������
        //ɾ��Ԫ��
        List.remove(4);
        System.out.println(List);   //����ǿ ��ɾ����
        //Ԫ�س���
        int a = List.size();
        System.out.println("�ü��ϵĳ���Ϊ��  " +a);
    }
}
