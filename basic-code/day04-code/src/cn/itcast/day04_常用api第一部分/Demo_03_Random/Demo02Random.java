package cn.itcast.day04_����api��һ����.Demo_03_Random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {

        Random r = new Random();
        //int num = r.nextInt(5);
        //��ӡ���� ��Χ�� ���ұ� [0-5)
        for (int i = 0; i < 10; i++) {

            int num = r.nextInt(5);
            System.out.println("������ǣ�" + num);

        }

    }


}
