package cn.itcast.day03_继承与多态.day03_interface.接口_默认方法;

public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添加一个抽象方法,实现的构造方法需要补充完整
    //public abstract void    method02();

    //新添加一个抽象方法，为默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法！！！");

    }
}
