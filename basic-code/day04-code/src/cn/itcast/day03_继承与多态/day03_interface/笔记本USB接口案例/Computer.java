package cn.itcast.day03_�̳����̬.day03_interface.�ʼǱ�USB�ӿڰ���;

public class Computer {
    public void powerOn() {
        System.out.println("����");
    }

    public void powerOff() {
        System.out.println("�ػ�");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {   //���жϣ�����ת�ͣ����ⱨ��
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close();
    }
}
