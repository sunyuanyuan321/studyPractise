package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class demo07_Convert {
    public static void main(String[] args) {
        //�ַ���ת��������
        "Hello".toCharArray();
        System.out.println("Hello".toCharArray());
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[2]);

        //�ַ���ת�����ֽ�����
        "abc".getBytes();
        byte[] bytes = "adc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //�ַ����������滻
        String str1 = "how do you do";
        String str2 = str1.replace("o", "*");
        System.out.println(str2);
        //�ַ����������滻,ʵ��Ӧ�ã��滻���дʻ�
        String language1 = "��᲻����ѽ�����ү�ģ�";
        String language2 = language1.replace("��ү��","***");
        System.out.println(language2);

    }
}
