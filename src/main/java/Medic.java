public class Medic extends Hero{

    private int healPoints;


    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getSuperPower());
    }


    public void increaseExperience(){
        healPoints = (int) (healPoints * 1.10);
        System.out.println("Medic увеличил опыт лечения. Теперь у него " + healPoints + " единиц лечения.");
    }
}
