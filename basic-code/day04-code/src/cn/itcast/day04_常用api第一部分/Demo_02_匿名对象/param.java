package cn.itcast.day04_����api��һ����.Demo_02_��������;

import java.util.Scanner;

public class param {
    public static void methodParam(Scanner sc2){
        int num=sc2.nextInt();
        System.out.println("��������������ǣ�"+num);
    }

    public static Scanner methodReturn(){
        //��ͨ���
       // Scanner sc = new Scanner(System.in);
       // return sc;

        //��������
        return new Scanner(System.in);
    }
}
