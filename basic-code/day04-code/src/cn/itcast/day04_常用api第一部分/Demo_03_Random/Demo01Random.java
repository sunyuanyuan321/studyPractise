package cn.itcast.day04_����api��һ����.Demo_03_Random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt();
        //����������� int ������Χ
        System.out.println("���������ǣ�" + num);

    }
}
