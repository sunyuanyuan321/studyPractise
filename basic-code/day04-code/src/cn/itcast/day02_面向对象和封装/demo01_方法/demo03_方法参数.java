package cn.itcast.day02_�������ͷ�װ.demo01_����;

public class demo03_�������� {
    /*�������޷���ֵ
    �����з���ֵ�ķ���������ʹ�õ������á���ӡ���û��߸�ֵ���á�
    �����޷���ֵ�ķ�����ֻ��ʹ�õ������ã�����ʹ�ô�ӡ���û��߸�ֵ���á�
     */
    public static void main(String[] args) {
        method1(4, 6);
        method2();
        System.out.println("===========");
        int num = getsum(2, 5);
        System.out.println("����ֵ�ǣ�" + num);
        System.out.println("2================");
        getsum2(10,20);
    }
    //����voidû�з���ֵ�ķ�����ֻ�е������ã����ܴ�ӡ���û��߸�ֵ����
    public static void method1(int a, int b) {  //void����Ҫ����ֵ����Ϊ��ֱ�Ӵ�ӡ
        int result = a * b;
        System.out.println("�����:" + result);
    }

    public static void method2() {   //void����Ҫ����ֵ��method����Ҫ������������
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "  " + "hello,word");
        }
    }

    public static int getsum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void getsum2(int a, int b) {
        int result = a + b;
        System.out.println("����ǣ�"+result);
    }
}

