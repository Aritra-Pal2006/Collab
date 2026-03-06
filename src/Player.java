import java.util.Random;

public class Player {
    int health;
    int def;
    boolean isDef;
    Random rand = new Random();

    public Player(int health) {
        this.health = health;
        this.def = 5;
        this.isDef = false;
    }

    public int attackEnemy() {
        int damage = rand.nextInt(201);
        return damage;
    }

    public void defend() {
        isDef = true;
    }

    public void takeDamage(int enemAtk) {
        int damage = enemAtk - def;
        if (isDef) {
            damage = damage / 2;
        }
        if (damage < 0) {
            damage = 0;
        }
        health = health - damage;
        isDef = false;
    }

    public boolean isAlive() {
        return health > 0;
    }
}