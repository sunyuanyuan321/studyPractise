package cn.itcast.day02_�������ͷ�װ.demo01_����;

public class ������������ {
    public static void main(String[] args) {
//        int a = 5;
//        int c = 6;
//        boolean b;
//        b = a > c;
//        System.out.println("b:" + b);
//        System.out./*��Ӱ��*/println('a');
//        System.out.println("A");   //�ܿ�����
//        //System.out.println(null);
//        int y = 1;

//
//        int c = (int)60000000000L;
//        System.out.println(c);
//
//        long d = 60000000000L;
//        System.out.println(d);
//        int e = (int)4.9;
//        System.out.println(e);
//        char t = 'A';
//        System.out.println(t);

        //��Ԫ��������������� = �����ж� �� ���ʽa�����ʽb  �����жϣ�������ȡa   �����жϲ�������ȡb
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;   //��Ԫ���㣬ȡ���ֵ������ѡ��һ
        int min = a > b ? b : a;
        System.out.println("���ֵ�ǣ�" + max);
        System.out.println("��Сֵ�ǣ�" + min);

    }
}