package com.lil.杂.mianshi.jichu;


/**
 * @author Lil
 * @date 2021/7/16 15:44
 */
//实例里面的普通字段是有单独的空间的, 而静态字段是共享空间, 谁都可以使用, 谁都可以更改.
// 一般用类名来访问静态变量(虽然实例可以访问静态字段, 但是它们指向的其实都是Person class的静态字段
// 静态方法只能访问静态变量, 一般用类访问.用实例变量访问会得到警告
public class 静态字段和静态方法 {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 6);
        Person hong = new Person("Xiao Hong", 7);

        ming.number = 88;
        System.out.println(ming.number);
        hong.number = 99;
        System.out.println(hong.number);

        System.out.println(Person.number);
        System.out.println(" ============================================ ");
        Person.setNumber(10000);
        System.out.println(Person.number);
    }
}
class Person {
    public String name;
    public int age;

    public static int number;

    public static void setNumber (int value) {
        number = value;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
