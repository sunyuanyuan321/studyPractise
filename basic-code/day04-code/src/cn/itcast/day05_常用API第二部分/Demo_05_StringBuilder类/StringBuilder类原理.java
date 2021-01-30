package cn.itcast.day05_常用API第二部分.Demo_05_StringBuilder类;

public class StringBuilder类原理 {
    public static void main(String[] args) {
        //实际上产生了三个对象，占用空间，造成效率低下
        String s = "Hello";
        s += "World";
        System.out.println(s);

        //StringBuilder类可以解决这一问题，实际是构造了一个可以改变长度的，字节数组容器，再添加字符串
        StringBuilder sb = new StringBuilder();  //空参构造方法
        System.out.println("打印出来："+sb);
        StringBuilder sb2 = new StringBuilder("adc");  //带参数构造方法
        System.out.println(sb2);


//        String str = new String("abc");
//        char data[] = {'a', 'b', 'c'};
//        String str2 = new String(data);
//        System.out.println(str + "       " + str2);
//        System.out.println(str.toString() == str2.toString());
    }
}
