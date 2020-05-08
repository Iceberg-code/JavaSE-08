package cn.itcast.day08.demo03;

public class Body {     //外部类

    public class Heart {        //成员内部类

        //内部类的方法
        public void beat(){
            System.out.println("跳动！");
            System.out.println("我是：" + name);   //正确写法，可以访问外部类的name
        }
    }

    //外部类的成员变量
    private String name;

    //外部类的成员方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
