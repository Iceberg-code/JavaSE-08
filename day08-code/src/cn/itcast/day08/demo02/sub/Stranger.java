package cn.itcast.day08.demo02.sub;
//不在同一包且是非子类
import cn.itcast.day08.demo02.MyClass;

public class Stranger {
    public void methodStrange(){
        System.out.println(new MyClass().num1);
//        System.out.println(new MyClass().num2); //错误写法
//        System.out.println(new MyClass().num3); //错误写法
//        System.out.println(new MyClass().num4); //错误写法
    }
}
