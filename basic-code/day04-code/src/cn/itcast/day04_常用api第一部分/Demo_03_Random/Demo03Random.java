package cn.itcast.day04_����api��һ����.Demo_03_Random;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();

        //�������Χ�Զ���ȡֵ������� ��Χ [1-5]
        for (int i = 0; i < 10; i++) {   //10.fori  ��ݼ�
            int num = r.nextInt(5) + 1;
            System.out.println("������ǣ���" + num);

        }
    }
}
