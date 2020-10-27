package demo.innerClass;

public class DemoHero {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("lucian");
        hero.setAge(23);
        Skill skill = new Skill() {
            @Override
            public void useSkill() {
                System.out.println("biu~biu~biu");
            }
        };
        hero.setSkill(skill);
        Weapon weapon = new Weapon("doran",300);
        hero.setWeapon(weapon);
        hero.attack();
    }
}
