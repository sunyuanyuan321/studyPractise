package cn.itcast.day03_�̳����̬.day03_interface.�ʼǱ�USB�ӿڰ���;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("�򿪼���");
    }

    @Override
    public void close() {
        System.out.println("�رռ���");
    }

    public void type(){
        System.out.println("��������");
    }
}
