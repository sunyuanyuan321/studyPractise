package cn.itcast.day05_����API�ڶ�����.Demo_06_�������Ͱ�װ��;

public class װ������� {
    public static void main(String[] args) {
        //���췽����integer ��int value��
        Integer in1 = new Integer(1);
        System.out.println(in1);  //1  ,��д��toString����

        //���췽����integer ��String value��
        Integer in2 = new Integer("1");
        System.out.println(in2);

        //��̬������Static Integer valueof��int i��
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        //��̬������ Static Integer valueof��String s��
        System.out.println(Integer.valueOf("5"));

        //����  NumberFormatException
        System.out.println(Integer.valueOf("����"));
    }
}
