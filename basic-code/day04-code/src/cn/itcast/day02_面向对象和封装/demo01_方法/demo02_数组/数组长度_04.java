package cn.itcast.day02_�������ͷ�װ.demo01_����.demo02_����;

/*
��λ�ȡ����ĳ��ȣ�
��ʽ����������.length
�õ�һ��int���֣���������ĳ���

���鴴���󣬳��������ڼ䣬���Ȳ��ɸı�
 */
public class ���鳤��_04 {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = {1, 2, 3, 4, 5, 6, 7, 8};

        int len = arrayB.length;
        System.out.println(len);

        //ʹ��ѭ��,����
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }


}
