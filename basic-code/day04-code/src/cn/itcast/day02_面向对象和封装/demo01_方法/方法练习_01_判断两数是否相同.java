package cn.itcast.day02_�������ͷ�װ.demo01_����;

//����һ�������������ж����������Ƿ���ͬ

public class ������ϰ_01_�ж������Ƿ���ͬ {
    public static void main(String[] args) {
        same(4, 5);
        System.out.println(isSame(4, 5));
    }

    public static void same(int a, int b) {
        if (a == b) {
            System.out.println("����������ͬ");
        } else {
            System.out.println("������������ͬ");
        }
    }

    public static boolean isSame(int a, int b) {

        //����һ
//        boolean same;
//        if (a==b){
//            same=true;
//        }
//        else{
//            same=false;
//        }
//        return same;
        //������
//        boolean same;
//        same = a == b ? true : false;
//        return same;
        //������
//        boolean same;
//        same = a == b;
//        return same;
        //������
        return a == b;
    }

}
