package cn.itcast.day04_常用api第一部分.Demo_05_String类.练习;

public class a {
    public static void main(String[] args) {
        //字符串数组 转换成 字符串
        char[] chars = {'a', 'b', 'c'};
        String a = new String(chars);
        System.out.println(a);

        //数值型数组 转换成 字符串
        int[] age = {23, 21, 22};
        String age2 = new String(age.toString());
        System.out.println(age[1]);


        //字符串 转换成 数组
        String name = "高圆圆";
        char[] char2 = name.toCharArray();
        System.out.println(char2[1]);
    }
}
