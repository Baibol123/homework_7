public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(150, 50, "FIREBALL");
        heroes[1] = new Medic(150, 0, "HEALING", 10);
        heroes[2] = new Warrior(250, 70, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();


            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }

}