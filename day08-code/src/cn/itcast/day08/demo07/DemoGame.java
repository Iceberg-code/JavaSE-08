package cn.itcast.day08.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setName("源氏"); //设置英雄名称

        //设置英雄技能
//        hero.setSkill(new SkillImpl()); //使用单独定义的实现类

        //还可以使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Biu~biu~biu");
//            }
//        };

        //进一步简化，同时用用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pai");
            }
        });
        hero.attack();
    }
}
