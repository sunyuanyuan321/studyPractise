package cn.itcast.day02_�������ͷ�װ.demo01_����.demo02_����;
/*
��������Ԫ�صĸ�ʽ��
��������[����ֵ]
����ֵ�������鵱��Ԫ�صı�ţ�����ֵ��0��ʼ���ӳ���-1������
 */

public class ����ķ���_02 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        System.out.println(arrayA); //   [I@1540e19d,��ӡ�������ڴ��ַ����ϣֵ
        System.out.println(arrayA[0]);  //1
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("-----------------");
        //�����ֵ����ֵ������
        int num = arrayA[2];
        System.out.println(num);

        //��̬��ʼ��һ������
        /*
        ʹ�ó�ʼ������ʱ��Ԫ�ػ��Զ�ӵ��һ��Ĭ��ֵ��
        1���������ͣ�Ĭ��ֵ��0
        2���������ͣ�Ĭ��ֵ��0.0
        3���ַ����ͣ�Ĭ��ֵ����/u0000��
        4���������ͣ�Ĭ��ֵ��false
        5���������ͣ�Ĭ��ֵ��null
         */
        int[] arrayB = new int [3];
        System.out.println(arrayB);
        System.out.println(arrayB[0]);  // Ĭ��ֵΪ0
        //��̬��ʼ����ֵ
        arrayB[2]=100;
        System.out.println(arrayB[2]);
    }
}
