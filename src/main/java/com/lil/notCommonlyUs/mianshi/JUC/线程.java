package com.lil.notCommonlyUs.mianshi.JUC;
/**
 * @author Lil
 * @date 2021/7/15 19:16
 */
public class 线程 {
    public static void main(String[] args) {
        Thread aa = new Thread(() -> {
            //isDaeMon()表示是用户线程还是守护线程,true为守护线程, false为用户线程
            System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
            while (true) {
            }
        }, "aa");
        //线程名字 "aa"
        //start方法创建线程
        aa.setDaemon(true);
        aa.start();

        //打印主线程
        System.out.println(Thread.currentThread().getName() + "主线程over");
    }
}
