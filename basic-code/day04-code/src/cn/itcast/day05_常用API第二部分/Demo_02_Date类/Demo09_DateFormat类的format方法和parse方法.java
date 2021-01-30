package cn.itcast.day05_常用API第二部分.Date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo09_DateFormat类的format方法和parse方法 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd 嘿嘿 HH:mm:ss");
        Date date = new Date();

        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
        System.out.println("---------");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd 嘿嘿 HH:mm:ss");//ParseException,格式错误的话，会抛异常
        final Date date2 = sdf2.parse("2020-36-15 嘿嘿 23:36:31");//处理异常，alt+enter  忽视
        System.out.println(date2);

    }
}
