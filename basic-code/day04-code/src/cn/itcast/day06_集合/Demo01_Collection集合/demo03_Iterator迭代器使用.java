package cn.itcast.day06_����.Demo01_Collection����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo03_Iterator������ʹ�� {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("����");
        coll.add("����");
        coll.add("wanger");
        System.out.println(coll);  //[����, ����]

        //1������������
        Iterator<String> it1 = coll.iterator();
        System.out.println(it1);  //java.util.ArrayList$Itr@1540e19d

        //2����whileѭ�����жϡ���ȡԪ��
        while (it1.hasNext()) {  //it1.hasNext() == true
            System.out.println("whileѭ��������Ԫ��:" + it1.next());
        }

        System.out.println("==============");

        //3��forѭ��
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            System.out.println("forѭ��������Ԫ��:" + it2.next());
        }

        System.out.println("-----------");
        //��ǿforѭ��
        for (String s :coll){
            System.out.println(s);
        }

        System.out.println("______________");

        //��ǿforѭ��,Ҳ���Ա�������
        int [] in ={1,2,3,4,5};
        for (int i :in){
            System.out.println(i);
        }

//        System.out.println("===========");
//        System.out.println( "ʹ��hasNaxt(),�����ж��Ƿ���Ԫ�أ�"+it1.hasNext());
//        System.out.println("������Ԫ��"+it1.next());
//
//        System.out.println( "ʹ��hasNaxt(),�����ж��Ƿ���Ԫ�أ�"+it1.hasNext());
        //System.out.println("������Ԫ��"+it1.next());
    }
}
