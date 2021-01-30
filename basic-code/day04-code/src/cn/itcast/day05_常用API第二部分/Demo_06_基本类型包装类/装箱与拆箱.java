package cn.itcast.day05_常用API第二部分.Demo_06_基本类型包装类;

public class 装箱与拆箱 {
    public static void main(String[] args) {
        //构造方法：integer （int value）
        Integer in1 = new Integer(1);
        System.out.println(in1);  //1  ,重写了toString方法

        //构造方法：integer （String value）
        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法：Static Integer valueof（int i）
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        //静态方法： Static Integer valueof（String s）
        System.out.println(Integer.valueOf("5"));

        //报错  NumberFormatException
        System.out.println(Integer.valueOf("中文"));
    }
}
