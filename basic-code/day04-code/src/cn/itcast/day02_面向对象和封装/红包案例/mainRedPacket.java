package cn.itcast.day02_�������ͷ�װ.�������;

import java.util.ArrayList;

public class mainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Ⱥ��",100);

        Menber one =new Menber("��ԱA",0);
        Menber two =new Menber("��ԱB",0);
        Menber three=new Menber("��ԱC",0);

        manager.show();
        one.show();
        two.show();
        three.show();

        ArrayList<Integer> redList  = manager.send(20,3);

        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        System.out.println("======================");

        manager.show();  //6 6 8
        one.show();
        two.show();
        three.show();
    }

}
