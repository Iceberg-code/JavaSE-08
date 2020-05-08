package cn.itcast.day08.demo02;
//在同一个包且是子类
public class Son extends MyClass {
    public void methodSon(){
        System.out.println(super.num1);
        System.out.println(super.num2);
        System.out.println(super.num3);
//        System.out.println(super.num4); //错误写法
    }
}
