package cn.itcast.day02_面向对象和封装.demo01_方法;

/*方法其实就是若干语句的功能集合
参数：进入方法的数据
返回值：从方法中出来的数据
 修饰符
 */

public class demo02_方法定义 {
    /*方法的三种调用格式：
    1、单独调用：方法名称（参数）；
    2、打印调用；
    3、赋值调用；

    */
    public static void main(String[] args) {
        sum(1,2);  //调用方法，1、单独调用
        System.out.println("1=========");
        System.out.println(sum(10,20)); //2、打印调用
        System.out.println("2=========");
        int number =sum(10,30);
        System.out.println("变量的值是："+number); // 3、赋值调用
    }
    /*二者求和的方法自定义
    方法名：sum  取名规则和变量一样，小驼峰*/
    public static int sum(int a, int b) { //参数列表（参数类型）：int a，int b 进入数据是什么类型
        System.out.println("方法执行啦");
        int result = a + b;   //方法体 返回值的类型：int
//        System.out.println(result);
        return result; //return作用：第一停止当前方法，第二讲后面的返回值还给调用处
    }


}
