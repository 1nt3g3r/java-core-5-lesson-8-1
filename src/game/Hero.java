package game;

public class Hero implements Attackable, Damageable {
    private int hp = 100;

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public void applyDamage(int damage) {
        hp -= damage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hp=" + hp +
                '}';
    }
}
