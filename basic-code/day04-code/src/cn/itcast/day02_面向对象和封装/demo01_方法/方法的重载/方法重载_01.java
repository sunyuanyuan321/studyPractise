package cn.itcast.day02_�������ͷ�װ.demo01_����.����������;

/*
���ڹ������Ƶķ�������Ϊ�����б�һ����ȴ��Ҫ��ס��ô�಻ͬ�ķ������ƣ��ǳ��鷳
���������أ��ڶ������������һ�������ǲ����б�һ����
�������ص�Ӱ�����أ�
1������������ͬ
2�����������Ͳ�ͬ
3�������Ķ�����˳��ͬ
����Ӱ�췽�����أ�
1��������������޹�
2���뷽���ķ���ֵ�޹�
 */
public class ��������_01 {
    public static void main(String[] args) {
        System.out.println(sum5(2, 3));
        System.out.println("==============");
        System.out.println(sum5(2, 3, 4));
        System.out.println("==============");
        System.out.println("���������Ͳ�ͬ    " + sum5(2, 2.5));
        System.out.println("3�������Ķ�����˳��ͬ   "+sum5(1.5,1));
    }

    public static int sum5(int a, int b) {
        int c = a + b;   //��������
        return c;
    }
    //1��������������޹�
//    public static int sum5(int a, int b) {
//        int c = a + b;   //��������
//        return c;
//    }
    //2���뷽���ķ���ֵ�޹�
//    public static double sum5(int a, int b) {
//        int c = a + b;   //��������
//        return c;
//    }

    public static int sum5(int a, double b) {
        int c = a + (int) b;    //2�����������Ͳ�ͬ
        return c;
    }

    public static int sum5(double b, int a){
        int c = a+(int)b;      //3�������Ķ�����˳��ͬ
        return c;
    }

    public static int sum5(int a, int b, int c) {
        int d = a + b + c;     //1������������ͬ
        return d;
    }


}
