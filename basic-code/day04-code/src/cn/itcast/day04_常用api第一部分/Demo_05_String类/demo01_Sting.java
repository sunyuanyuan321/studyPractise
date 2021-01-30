package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class demo01_Sting {
    public static void main(String[] args) {
        //直接创建
        String name = "高圆圆";  //直接写上双引号，就是字符串对象
        System.out.println(name);
        String age = new String("20");
        System.out.println(age);

        //字符串创建3中方法
        //1、空参
        String str1 = new String();
        System.out.println("第一个字符串:" + str1);

        //2、
        char[] charArray = {'A', 'B', 'C'};
        System.out.println("打印数组：" + charArray);  //数组转换字符串，变成打印地址
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //ctrl+点击类名称，查看类详细信息
        //3、
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);


    }
}
