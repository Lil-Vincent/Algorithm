package com.lil.杂.mianshi.jichu;

/**
 * @author Lil
 * @date 2021/7/16 16:35
 */
//内部类不能单独存在, 必须通过外部类实例再创建内部类实例
// Inner Class和普通Class相比，除了能引用Outer实例外，还有一个额外的“特权”，
// 就是可以修改Outer Class的private字段，因为Inner Class的作用域在Outer Class内部，
// 所以能访问Outer Class的private字段和方法。
public class 内部类 {
    public static void main(String[] args) {
        Out outer = new Out("Outer");
        Out.inner inner = outer.new inner();
        inner.hello();
    }
}
class Out {
    private String name;

    public Out(String name) {
        this.name = name;
    }
    class inner {
        void hello() {
            System.out.println("hello" + Out.this.name);
        }
    }
}
