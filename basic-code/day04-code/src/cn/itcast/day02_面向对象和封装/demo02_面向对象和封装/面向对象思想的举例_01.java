package cn.itcast.day02_�������ͷ�װ.demo02_�������ͷ�װ;

import java.util.Arrays;
//������JDK�Դ������Զ�����
/*
�����������--��װ���̳У���̬

�ࣺ ��һ����� ���� �� ��Ϊ �ļ���
���� ��һ������ľ������֣����������һ��ʵ��
������ Сè
����һֻСè
���ԣ����֣����䣬���أ���ɫ����
��Ϊ���Է���˯��������Ϸ����

 */
public class �������˼��ľ���_01 {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        //������̾�������ӡ����Ϊ [10,20,30,40,50]
        //�ص㣺������̣�ÿһ������ϸ�ڶ�Ҫ������Ϊ
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            }
            else    {
                System.out.println(array[i]+"]");
            }
        }

        //��������������һ��JDK�������ṩ�õ� Arrays ��
        // ������һ��toString ������������
        System.out.println(Arrays.toString(array));


    }
}
