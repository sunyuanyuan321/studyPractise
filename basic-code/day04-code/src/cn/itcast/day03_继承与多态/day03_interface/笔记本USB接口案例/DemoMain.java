package cn.itcast.day03_继承与多态.day03_interface.笔记本USB接口案例;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        Mouse mouse = new Mouse();  //创建鼠标的对象
        USB usbMouse = new Mouse();  //多态，向上转型，父类应用指向子类对象（接口）
//        USB usbMouse = (USB) mouse;     //多态。向下转型.  也可以写成   USB usbMouse = mouse；省略写法
        computer.useDevice(usbMouse);  //方法调用，传参为USB接口类型，（实现类）
        System.out.println("=====================");


        //准备一个键盘，共电脑使用，即创建键盘的对象
        //方法一：多态写法，向上转型，把Keyboard当作USB，因为computer传参类型是USB类型的
//        Keyboard keyboard = new Keyboard();   //这里可以省略，下面已经 new 了键盘对象了
//        keyboard.type(); 带进computer方法里面
        USB usbKeyboard = new Keyboard();  //（父类引用指向子类对象）（接口指向实现类对象）
        computer.useDevice(usbKeyboard);

        //方法二：多态写法，向上转型，方式二
//        Keyboard keyboard = new Keyboard();
//        USB usbKeyboard = keyboard;  // 也可以写成 USB usbKeyboard = (USB) keyboard；
//        computer.useDevice(usbKeyboard);

        //方法三：多态写法，向上转型，方式二
//        Keyboard keyboard = new Keyboard();
//        //USB usbKeyboard = keyboard;  // 也可以写成 USB usbKeyboard = (USB) keyboard；
//        computer.useDevice(keyboard);  //强制类型转换：实现类-->USB类型

        //方法四：没有用多态写法；省去转换步骤，强制类型转换：实现类-->USB类型
//        USB usbKeyboard = new Keyboard();
//        computer.useDevice(usbKeyboard);

        //方法五：多态写法，强制类型转换，实现类-->USB类型
//        computer.useDevice(new Keyboard());


        computer.powerOff();
    }
}
