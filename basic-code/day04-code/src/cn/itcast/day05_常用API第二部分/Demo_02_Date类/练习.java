package cn.itcast.day05_����API�ڶ�����.Date��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ��ϰ {
    public static void main(String[] args) throws ParseException {

        System.out.println("���������ĳ�������(yyyy-mm-dd)��");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
        Date bir = sdf1.parse(birthday);
        System.out.println(bir);

//        long birthdayTime = bir.getTime();
//        System.out.println(bir.getTime());
//        System.out.println(System.currentTimeMillis());

        long days = (System.currentTimeMillis() - bir.getTime()) / 24 / 60 / 60 / 1000;
        System.out.println("����  " + days + "����");

//        Date date = new Date();
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
//        sdf2.parse(text1);

    }
}
