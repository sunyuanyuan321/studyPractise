package cn.itcast.day02_面向对象和封装.demo01_方法;

public class 方法初步体验 {
    public static void main(String[] args) {
//        int a = 5;
//        int c = 6;
//        boolean b;
//        b = a > c;
//        System.out.println("b:" + b);
//        System.out./*不影响*/println('a');
//        System.out.println("A");   //能看到吗
//        //System.out.println(null);
//        int y = 1;

//
//        int c = (int)60000000000L;
//        System.out.println(c);
//
//        long d = 60000000000L;
//        System.out.println(d);
//        int e = (int)4.9;
//        System.out.println(e);
//        char t = 'A';
//        System.out.println(t);

        //三元运算符，变量名称 = 条件判断 ？ 表达式a：表达式b  条件判断，成立，取a   条件判断不成立，取b
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;   //三元运算，取最大值，二者选其一
        int min = a > b ? b : a;
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);

    }
}