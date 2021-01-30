package cn.itcast.day06_����.Demo01_Collection����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class demo02_Collection���ϳ��÷��� {
    public static void main(String[] args) {
        //����ɾ��������ж�
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        System.out.println(coll);  //[Hello, World]

        boolean result = coll.remove("World");
        System.out.println(result);  //true
        System.out.println(coll);   //[Hello]

        //���
        coll.clear();
        System.out.println(coll);  //[] �����
        System.out.println("�ж��Ƿ�ռ��ϣ�" + coll.isEmpty());

        coll.add("Hello");
        coll.add("World");
        System.out.println(coll.size());  //2
        System.out.println(coll.contains("Hello"));  //true

        // ���϶��� ת������
        Object[] array1 = coll.toArray();
        System.out.println(array1.length);
        System.out.println(array1);  //��ӡ�ڴ��ֵַ��[Ljava.lang.Object;@1540e19d
        for (int i = 0; i < array1.length; i++) {
            System.out.println("��" + (i + 1) + "�������ǣ�" + array1[i]);
            if (i == array1.length-1) {
                System.out.println("һ���У�"+(i + 1)+"������Ԫ��");
            }
        }
    }
}
