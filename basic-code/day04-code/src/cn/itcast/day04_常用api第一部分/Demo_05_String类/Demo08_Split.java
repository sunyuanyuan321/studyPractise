package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class Demo08_Split {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,d";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //  .���У���������ʽ�У�.�к���  ����д \\.
        String str2 = "xxx.yyy.zzz";
        String[] array2 = str2.split(".");
        System.out.println(array2.length);  //0
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        //����д \\.
        String [] array3 =str2.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
