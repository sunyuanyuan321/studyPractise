package cn.itcast.day02_�������ͷ�װ.demo01_����.demo02_����;

public class �������_06 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 45, 20};

        //����,����һ
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");
        //����������������Ϊ�������ݲ���
        printArray(array);  //����ȥ���Ǿ���array���б���ĵ�ֵַ

        //�������ֵ
        System.out.println("------------");
        int a = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > a) {
                a = array[j];
            }
        }
        System.out.println(a);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


