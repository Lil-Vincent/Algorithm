package com.lil.notCommonlyUs.mianshi.jichu2;

import com.lil.notCommonlyUs.mianshi.jichu.作用域;

/**
 * @author Lil
 * @date 2021/7/16 16:15
 */
public class 作用域2 extends 作用域 {
    //作用域1中hi() 方法用的是protected修饰因此继承类可以访问
    void foo () {
        hi();
    }
}
