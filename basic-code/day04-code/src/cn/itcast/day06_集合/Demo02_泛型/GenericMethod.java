package cn.itcast.day06_����.Demo02_����;

public class GenericMethod {
    //������Ϊ����ֵ���ͣ�����һ������
    public <M> void method01(M m) {
        System.out.println(m);
    }

    //����һ����̬����
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
