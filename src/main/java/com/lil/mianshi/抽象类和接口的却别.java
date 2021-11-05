package com.lil.mianshi;

/**
 * @author Lil
 * @date 2021/7/19 10:50
 */
//抽象类存在的意义: 既要方法但是又不要具体实现, 需要在子类中去实现, 则需要抽象类
public class 抽象类和接口的却别 {
    public static void main(String[] args) {
        Person stu = new Student();
        Person tea = new Teacher();
        stu.run();
        tea.run();

        System.out.println("==================================");

        Ren doctor = new Doctor("小明");
        doctor.run();
        Job doctor1 = new Doctor("小红");
        doctor1.hello();
    }

}

//接口继承
class Doctor implements Ren, Job{

    String name;

    public Doctor(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public void hello() {
        System.out.println(this.name + "医生和你说: hello, world");
    }
}

abstract class Person {
    abstract void  run();
}

class Student extends Person {
    @Override
    void run() {
        System.out.println("学生跑");
    }
}
class Teacher extends Person {
    @Override
    void run() {
        System.out.println("老师跑");
    }
}
