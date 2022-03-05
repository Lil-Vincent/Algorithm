package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/3/30 11:39
 */
public class JZ2ReplaceSpaces {
    public String replaceSpace(String s){
        if (s == null || "".equals(s))
            return s;
        return s.replace(" ","%20");
    }
}
