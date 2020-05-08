package cn.itcast.day08.demo02;
//在同一个包且是非子类
public class MyAnother {
    public void anotherMethod(){
        System.out.println(new MyClass().num1);
        System.out.println(new MyClass().num2);
        System.out.println(new MyClass().num3);
//        System.out.println(new MyClass().num4);   //错误写法！
    }
}
