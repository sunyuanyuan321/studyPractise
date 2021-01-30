package cn.itcast.day03_继承与多态.day03_interface.笔记本USB接口案例;

public class Computer {
    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {   //先判断，向上转型，避免报错
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
