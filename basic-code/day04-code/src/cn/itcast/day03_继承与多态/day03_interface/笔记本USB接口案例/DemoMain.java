package cn.itcast.day03_�̳����̬.day03_interface.�ʼǱ�USB�ӿڰ���;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        Mouse mouse = new Mouse();  //�������Ķ���
        USB usbMouse = new Mouse();  //��̬������ת�ͣ�����Ӧ��ָ��������󣨽ӿڣ�
//        USB usbMouse = (USB) mouse;     //��̬������ת��.  Ҳ����д��   USB usbMouse = mouse��ʡ��д��
        computer.useDevice(usbMouse);  //�������ã�����ΪUSB�ӿ����ͣ���ʵ���ࣩ
        System.out.println("=====================");


        //׼��һ�����̣�������ʹ�ã����������̵Ķ���
        //����һ����̬д��������ת�ͣ���Keyboard����USB����Ϊcomputer����������USB���͵�
//        Keyboard keyboard = new Keyboard();   //�������ʡ�ԣ������Ѿ� new �˼��̶�����
//        keyboard.type(); ����computer��������
        USB usbKeyboard = new Keyboard();  //����������ָ��������󣩣��ӿ�ָ��ʵ�������
        computer.useDevice(usbKeyboard);

        //����������̬д��������ת�ͣ���ʽ��
//        Keyboard keyboard = new Keyboard();
//        USB usbKeyboard = keyboard;  // Ҳ����д�� USB usbKeyboard = (USB) keyboard��
//        computer.useDevice(usbKeyboard);

        //����������̬д��������ת�ͣ���ʽ��
//        Keyboard keyboard = new Keyboard();
//        //USB usbKeyboard = keyboard;  // Ҳ����д�� USB usbKeyboard = (USB) keyboard��
//        computer.useDevice(keyboard);  //ǿ������ת����ʵ����-->USB����

        //�����ģ�û���ö�̬д����ʡȥת�����裬ǿ������ת����ʵ����-->USB����
//        USB usbKeyboard = new Keyboard();
//        computer.useDevice(usbKeyboard);

        //�����壺��̬д����ǿ������ת����ʵ����-->USB����
//        computer.useDevice(new Keyboard());


        computer.powerOff();
    }
}
