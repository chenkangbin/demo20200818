package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class demojava {

    public static void main(String[] args) {
        // getFile(10000);
//        heaptest();
//        String returnStr = tryCatch();
//        System.out.println(returnStr);

//        chaixiang();

//        Object[] o = new Object[2];

        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1 == str2);

    }
    public static void test1() {
        System.out.println("test1");
        test2();
    }

    public static void test2() {
        System.out.println("test2");
        test3();
    }

    public static void test3() {
        System.out.println("test3");
        test4();
    }

    public static void test4() {
        System.out.println("test4");
        test5();
    }

    public static void test5() {
        System.out.println("test5");
        test6();
    }

    public static void test6() {
        System.out.println("test6");
        test7();
    }

    public static void test7() {
        System.out.println("test7");
        test8();
    }

    public static void test8() {
        System.out.println("test8");
        test9();
    }

    public static void test9() {
        System.out.println("test9");
        test10();
    }

    public static void test10() {
        System.out.println("test10 end");
    }


    public static String getFile(int num) {
        System.out.println(num);
        if (num < 0) {
            return "结束" + num;
        } else {
            num--;
            getFile(num);
        }
        return "";
    }


    public static void heaptest() {
        int i = 0;
        List<byte[]> list = new ArrayList<>();
        try {
            while (true) {
                byte[] b = new byte[1024 * 2];
                list.add(b);

                i++;
                System.out.println(i);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


    public static String tryCatch() {
       try {
           System.out.println("try");
           return "try return";
       } catch (Exception e) {
            e.printStackTrace();
           return "catch return";
       } finally {
            return "finally return";
       }
    }


    public static void chaixiang() {
        Integer num = null;
        int i = num;
    }

}
