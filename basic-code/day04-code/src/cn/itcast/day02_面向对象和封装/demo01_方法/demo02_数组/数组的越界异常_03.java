package cn.itcast.day02_�������ͷ�װ.demo01_����.demo02_����;

/*
 ��������Խ���쳣
 ԭ���������д����
 ������޸ĳɴ��ڵ���ȷ�������
  */
public class �����Խ���쳣_03 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //��������Խ���쳣
        System.out.println(array[3]);
        System.out.println("=============");
        //��������û�г�ʼ��
        int[] arrayA;
      //  System.out.println(arrayA[0]);

        //��ָ���쳣 NullPointerException
        //ԭ������ new��ʼ��  ���������new
        int[] arrayB = null;   //����ָ�� ǰ�ᣬ�������ֵ��ȴû�н���new����  //���п����ڴ��ַ
        arrayB = new int[3];
        System.out.println(arrayB[0]); //NullPointerException
    }

}
