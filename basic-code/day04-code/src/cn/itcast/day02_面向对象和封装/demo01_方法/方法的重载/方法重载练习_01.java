package cn.itcast.day02_�������ͷ�װ.demo01_����.����������;

public class ����������ϰ_01 {
    public static void main(String[] args) {

        System.out.println(isSame((byte) 10, (byte) 20));
        System.out.println(isSame2((byte) 22, (byte) 22));
        System.out.println(isSame((short) 10, (short) 10));
        System.out.println(isSame(11,22));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("����byte��������");
        return a == b;
    }

    public static boolean isSame2(byte a, byte b) {
        System.out.println("����byte��������2");
        boolean c = a == b ? true : false;
        return c;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("����short��������");
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("����int��������");
        return a == b;
    }
}
