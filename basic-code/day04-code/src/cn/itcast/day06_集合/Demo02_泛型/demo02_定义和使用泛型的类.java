package cn.itcast.day06_����.Demo02_����;

public class demo02_�����ʹ�÷��͵��� {
    public static void main(String[] args) {
        //��������,��ʹ�÷��ͣ��̳е��� Object�࣬
        GeneracClass gc = new GeneracClass();
        gc.setName("����");
        //gc.setName(12);   //int���ͱ���
        System.out.println(gc.getName());

        GeneracClass2<Integer> in = new GeneracClass2<>();
     //   in.setName("12");  //�������Ͳ��ϣ����뱨��
        in.setName(12);
        System.out.println(in.getName());
    }
}
