package cn.itcast.day02_�������ͷ�װ.�������;

import java.util.ArrayList;

public class Manager extends User {
    //���췽�����޲Σ��в�
    public Manager() {
      //  super();       //Ĭ�Ͽ��Բ���д
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //Ⱥ��������ķ���
    public ArrayList<Integer> send(int totalMoney, int count) {
        //����һ������
        ArrayList<Integer> redList = new ArrayList<>();

        //Ⱥ�������
        int leftMoney = super.getMoney();

        if (totalMoney > leftMoney) {
            System.out.println("����");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);
        int mod = totalMoney % count;
        int avg = totalMoney / count;

        for (int i = 0; i < count; i++) {
            redList.add(avg);  //�ӵ�������
        }
        int last = avg + mod;
        redList.add(avg);
        return redList;
    }
}
