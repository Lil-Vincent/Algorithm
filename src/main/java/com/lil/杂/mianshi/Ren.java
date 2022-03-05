package com.lil.杂.mianshi;

/**
 * @author Lil
 * @date 2021/7/19 16:23
 */
public interface Ren {
    default void run(){
        System.out.println(getName() + "run");
    };
    String getName();
}
interface HaoRen extends Ren
{
    void hello();
}
