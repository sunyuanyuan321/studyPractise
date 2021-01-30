package cn.itcast.day02_面向对象和封装.红包案例;

import java.util.ArrayList;

public class mainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Menber one =new Menber("成员A",0);
        Menber two =new Menber("成员B",0);
        Menber three=new Menber("成员C",0);

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
