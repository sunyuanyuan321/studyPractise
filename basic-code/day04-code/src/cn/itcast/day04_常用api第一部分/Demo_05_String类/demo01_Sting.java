package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class demo01_Sting {
    public static void main(String[] args) {
        //ֱ�Ӵ���
        String name = "��ԲԲ";  //ֱ��д��˫���ţ������ַ�������
        System.out.println(name);
        String age = new String("20");
        System.out.println(age);

        //�ַ�������3�з���
        //1���ղ�
        String str1 = new String();
        System.out.println("��һ���ַ���:" + str1);

        //2��
        char[] charArray = {'A', 'B', 'C'};
        System.out.println("��ӡ���飺" + charArray);  //����ת���ַ�������ɴ�ӡ��ַ
        String str2 = new String(charArray);
        System.out.println("�ڶ����ַ�����" + str2);

        //ctrl+��������ƣ��鿴����ϸ��Ϣ
        //3��
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("�������ַ�����" + str3);


    }
}
