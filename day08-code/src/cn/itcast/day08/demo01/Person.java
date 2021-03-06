package cn.itcast.day08.demo01;
/*
* 对于成员变量来说，如果使用final关键字修饰，那么这个变量照样是不可变。
*
* 1、由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了。  （注：局部变量不具有默认值）
* 2、对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。（二者选其一，不能都用）
* 3、必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
* */
public class Person {
    private final String name /*= "安娜"*/;

    public Person() {
        name = "源氏";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //使用了final关键字修饰的成员变量，要去掉Setter方法，因为他可以对name成员变量重新赋值
//    public void setName(String name) {
//        this.name = name;
//    }
}
