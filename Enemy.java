public class Enemy {
    String name;
    int health;
    int attack;

    Enemy() {
        this.health=1000;
    }
}

public void takeDamage(int damage) {
    health=health-damage;
}

public int attackPlayer() {
    int damage = attack + (int)(Math.random() * 4);
    return damage;
}

public boolean isAlive() {
    if (health>0){
        return true;
    }
    return false;
}