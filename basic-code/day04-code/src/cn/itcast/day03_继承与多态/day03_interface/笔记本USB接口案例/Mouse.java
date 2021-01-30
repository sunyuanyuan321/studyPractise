package cn.itcast.day03_继承与多态.day03_interface.笔记本USB接口案例;

public class Mouse implements USB {
    @Override
    public void close() {
        System.out.println("打开鼠标");
    }

    @Override
    public void open() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }

}
