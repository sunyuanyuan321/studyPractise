package cn.itcast.day04_常用api第一部分.Demo_05_String类.练习;

public class b {
    public static void main(String[] args) {
//        System.out.println("请输入一串字符串");
//        Scanner aa = new Scanner(System.in);
//        String word = aa.next();
        //System.out.println(word);

        //字符串 转换成 byte数组
        String str1 = "aba123";
        byte[] str2 = str1.getBytes();
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }

//        for (int i = 1; i < str2.length - 1; i++) {
//            for (int j = 0; j < i; j++) {
//                if (str2[i] == str2[j]) {
//                    if ()
//
//                }
//            }
//        }


        for (int i = 0; i < str1.length(); i++) {

        }
        str1.indexOf(1);

    }
}
