package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/4/15 19:22
 */
public class JZ7 {
    public static int Fibonacci(int n) {
        int a=0,b=1;
        while(true){
            if(n==0) break;
            int c = a + b;
            a = b;
            b = c;
            n--;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("lj");
        int i = Fibonacci(5);
        System.out.println(i);
    }
}
