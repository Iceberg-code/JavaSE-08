package cn.itcast.day08.demo02;
//同一个类
public class MyClass {

    public int num1;
    protected int num2;
    int num3;   //默认是default
    private int num4;

    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
