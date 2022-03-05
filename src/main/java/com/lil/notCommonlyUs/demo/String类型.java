package com.lil.notCommonlyUs.demo;

/**
 * @author Lil
 * @date 2021/9/7 20:51
 */
/**
 * @Description: 字符串和编码
 * @Param: 
 * @Return: 
 */
public class String类型 {
    public static void main(java.lang.String[] args) {
//        String s1 = "hello";
//        char[] chars = {'你', '好'};
//        String s2 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//        String s3 = new String(chars);
//        System.out.println("s1:" + s1);
//        System.out.println("s2:" + s2);
//        System.out.println("s3:" + s3);
//        if (s1.equals(s2)) {
//            System.out.println("s1,s2相等");
//            System.out.println("s1" + s1);
//        }else {
//            System.out.println("s1,s2不相等");
//        }

        // 1. 字符串比较

//        String s1 = new String("hello");
//        String s2 = "Hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

//        //忽略大小写

//        System.out.println(s1.equalsIgnoreCase(s2));

//        //是否包含字串

//        System.out.println(s1.contains("el"));

//        System.out.println("Hello".substring(1));
//        System.out.println("Hello".substring(1, 3));


        //去除首位空白
//        System.out.println(" \tHello\n\r ".trim());
//        System.out.println(" \tHello\r\n ");
//
//        System.out.println("Hello".isEmpty());
//        System.out.println("hello".replace("h", "Sb"));
//        String s = "a, b , c, d";
//        System.out.println(s);
//        String[] s1 = s.split(" ");
//        System.out.println(s1);

        String[] arr = {"A", "B", "C", "D"};
        String str = String.join("++++++++", arr);
        System.out.println(str);
    }

}
