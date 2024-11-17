// Шаг 2
public class Hero {
    private String superpower;
    private final int health;
    private final int damage;

    public Hero(String superpower, int health, int damage) {
        this.health = Math.max(health, 0);
        this.damage = Math.max(damage, 0);
        this.superpower = superpower;

    }

    public Hero(int health, int damage) {
        this.health = Math.max(health, 0);
        this.damage = Math.max(damage, 0);
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
