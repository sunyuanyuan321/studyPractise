package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class Demo06_Substring {
    public static void main(String[] args) {
        //截取参数位置到字符尾行
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println(str1.substring(str1.indexOf("Wor")));

        //截取一定的范围，实际是  [  )
        String str4 = str1.substring(4,7);
        System.out.println(str4);   //oWo

    }
}
