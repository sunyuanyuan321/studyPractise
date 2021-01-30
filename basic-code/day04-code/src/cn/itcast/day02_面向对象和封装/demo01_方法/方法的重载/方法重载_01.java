package cn.itcast.day02_面向对象和封装.demo01_方法.方法的重载;

/*
对于功能类似的方法，因为参数列表不一样，却需要记住这么多不同的方法名称，非常麻烦
方法的重载：在多个方法的名称一样，但是参数列表不一样。
方法重载的影响因素：
1、参数个数不同
2、参数的类型不同
3、参数的多类型顺序不同
不会影响方法重载：
1、与参数的名称无关
2、与方法的返回值无关
 */
public class 方法重载_01 {
    public static void main(String[] args) {
        System.out.println(sum5(2, 3));
        System.out.println("==============");
        System.out.println(sum5(2, 3, 4));
        System.out.println("==============");
        System.out.println("参数的类型不同    " + sum5(2, 2.5));
        System.out.println("3、参数的多类型顺序不同   "+sum5(1.5,1));
    }

    public static int sum5(int a, int b) {
        int c = a + b;   //方法重载
        return c;
    }
    //1、与参数的名称无关
//    public static int sum5(int a, int b) {
//        int c = a + b;   //方法重载
//        return c;
//    }
    //2、与方法的返回值无关
//    public static double sum5(int a, int b) {
//        int c = a + b;   //方法重载
//        return c;
//    }

    public static int sum5(int a, double b) {
        int c = a + (int) b;    //2、参数的类型不同
        return c;
    }

    public static int sum5(double b, int a){
        int c = a+(int)b;      //3、参数的多类型顺序不同
        return c;
    }

    public static int sum5(int a, int b, int c) {
        int d = a + b + c;     //1、参数个数不同
        return d;
    }


}
