package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class demo07_Convert {
    public static void main(String[] args) {
        //字符串转换成数组
        "Hello".toCharArray();
        System.out.println("Hello".toCharArray());
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[2]);

        //字符串转换成字节数组
        "abc".getBytes();
        byte[] bytes = "adc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //字符串的内容替换
        String str1 = "how do you do";
        String str2 = str1.replace("o", "*");
        System.out.println(str2);
        //字符串的内容替换,实际应用，替换敏感词汇
        String language1 = "你会不会玩呀，你大爷的！";
        String language2 = language1.replace("大爷的","***");
        System.out.println(language2);

    }
}
