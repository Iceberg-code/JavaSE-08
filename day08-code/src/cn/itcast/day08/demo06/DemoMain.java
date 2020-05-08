package cn.itcast.day08.demo06;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄起一个名字，并设置年龄
        hero.setName("狂鼠");
        hero.setAge(10);

        //创建一个武器对象
        Weapon weapon = new Weapon("夹子");
        //为英雄配备武器
        hero.setWeapon(weapon);

        //年龄为10的英雄狂鼠正在用武器夹子攻击敌方
        hero.attack();
    }
}
