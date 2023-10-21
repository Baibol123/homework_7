public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superPower;
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }



    public String getSuperPower() {
        return superPower;
    }
}
