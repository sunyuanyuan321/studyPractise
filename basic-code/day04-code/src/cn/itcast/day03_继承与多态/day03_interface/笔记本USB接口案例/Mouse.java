package cn.itcast.day03_�̳����̬.day03_interface.�ʼǱ�USB�ӿڰ���;

public class Mouse implements USB {
    @Override
    public void close() {
        System.out.println("�����");
    }

    @Override
    public void open() {
        System.out.println("�ر����");
    }

    public void click(){
        System.out.println("������");
    }

}
