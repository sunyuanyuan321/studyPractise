package cn.itcast.day05_����API�ڶ�����.Date��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo09_DateFormat���format������parse���� {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd �ٺ� HH:mm:ss");
        Date date = new Date();

        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
        System.out.println("---------");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd �ٺ� HH:mm:ss");//ParseException,��ʽ����Ļ��������쳣
        final Date date2 = sdf2.parse("2020-36-15 �ٺ� 23:36:31");//�����쳣��alt+enter  ����
        System.out.println(date2);

    }
}
