package cn.itcast.day08.demo02.sub;
//在不同包且是子类
import cn.itcast.day08.demo02.MyClass;

public class MySon extends MyClass {
    public void methodMySon(){
        System.out.println(super.num1);
        System.out.println(super.num2);
//        System.out.println(super.num3); //错误写法
//        System.out.println(super.num4); //错误写法
    }
}
