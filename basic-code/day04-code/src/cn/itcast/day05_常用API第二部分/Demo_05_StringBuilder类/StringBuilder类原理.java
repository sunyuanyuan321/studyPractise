package cn.itcast.day05_����API�ڶ�����.Demo_05_StringBuilder��;

public class StringBuilder��ԭ�� {
    public static void main(String[] args) {
        //ʵ���ϲ�������������ռ�ÿռ䣬���Ч�ʵ���
        String s = "Hello";
        s += "World";
        System.out.println(s);

        //StringBuilder����Խ����һ���⣬ʵ���ǹ�����һ�����Ըı䳤�ȵģ��ֽ�����������������ַ���
        StringBuilder sb = new StringBuilder();  //�ղι��췽��
        System.out.println("��ӡ������"+sb);
        StringBuilder sb2 = new StringBuilder("adc");  //���������췽��
        System.out.println(sb2);


//        String str = new String("abc");
//        char data[] = {'a', 'b', 'c'};
//        String str2 = new String(data);
//        System.out.println(str + "       " + str2);
//        System.out.println(str.toString() == str2.toString());
    }
}
