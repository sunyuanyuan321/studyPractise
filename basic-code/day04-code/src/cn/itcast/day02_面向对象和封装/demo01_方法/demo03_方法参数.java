package cn.itcast.day02_面向对象和封装.demo01_方法;

public class demo03_方法参数 {
    /*方法有无返回值
    对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用。
    但对无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用。
     */
    public static void main(String[] args) {
        method1(4, 6);
        method2();
        System.out.println("===========");
        int num = getsum(2, 5);
        System.out.println("返回值是：" + num);
        System.out.println("2================");
        getsum2(10,20);
    }
    //对于void没有返回值的方法，只有单独调用，不能打印调用或者赋值调用
    public static void method1(int a, int b) {  //void不需要返回值，因为是直接打印
        int result = a * b;
        System.out.println("结果是:" + result);
    }

    public static void method2() {   //void不需要返回值，method不需要定义数据类型
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + "hello,word");
        }
    }

    public static int getsum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void getsum2(int a, int b) {
        int result = a + b;
        System.out.println("结果是："+result);
    }
}

