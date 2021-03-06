package cn.itcast.day08.demo01;
/*
* 当final关键字用来修饰一个类的时候，格式：
* public final class 类名称(){
*       // ...
* }
* 含义：当前这个类不能有任何的子类（太监类） - 不能用一个final类来作为父类
* 注意：如果一个类是final类，那么其中所有的成员方法都无法进行覆盖重写（因为没有子类）
* */
public final class MyClass {
    public void method(){
        System.out.println("方法执行！");
    }
}
