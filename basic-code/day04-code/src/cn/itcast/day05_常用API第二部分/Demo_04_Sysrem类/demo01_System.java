package cn.itcast.day05_����API�ڶ�����.Demo_04_Sysrem��;

import java.util.Calendar;
import java.util.Date;

public class demo01_System {
    public static void main(String[] args) {
        /*
        static long currentTimeMillis()
          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
          �������Գ����Ч��
         */
        System.out.println(System.currentTimeMillis());
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);

        //��ȡ��ǰʱ�䣬����һ��
        Date date1 = new Date();
        System.out.println("��ȡ��ǰʱ�䣬����һ��"+date1);

        //��ȡ��ǰʱ�䣬��������
        Calendar ca =Calendar.getInstance();
        System.out.println("��ȡ��ǰʱ�䣬��������"+ca.getTime());

        /*
        public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
            ������
src - Դ���顣
srcPos - Դ�����е���ʼλ�á�
dest - Ŀ�����顣
destPos - Ŀ�������е���ʼλ�á�
length - Ҫ���Ƶ�����Ԫ�ص������� 
         */


    }
}
