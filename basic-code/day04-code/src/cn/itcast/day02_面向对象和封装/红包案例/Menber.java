package cn.itcast.day02_�������ͷ�װ.�������;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {
    //���췽�����޲�/�в�
    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }


    public void receive (ArrayList<Integer> List){
        //�������������ȡһ���������ȡһ�����ϵ��������
        int index = new Random().nextInt(List.size());

        //�����������Ӽ�����ɾ����ͬʱ����ɾ��������ֵ���Լ���Ҫ��
        int delta  = List.remove(index);

        //get��set��������ȡ֮ǰ�ģ����Ϻ���ģ��õ����µĺ����ŵ�������
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
