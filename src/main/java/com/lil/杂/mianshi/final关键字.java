package com.lil.杂.mianshi;

/**
 * @author Lil
 * @date 2021/7/10 15:04
 */
public class final关键字 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outPut(1);

    }
}
class Outer{
    private int age = 10;
    void outPut(final int x){
        class Inner {
            void hello() {
                System.out.println("hello" + age + " x = " + x);
            }
        }
    }

}


