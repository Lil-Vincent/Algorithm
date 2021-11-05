package com.lil.review;

/**
 描述
 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 示例1
 输入：
 "We Are Happy"

 返回值：
 "We%20Are%20Happy"

 */
public class 替换空格 {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') stringBuilder.append("%20");
            else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
