package game;

public class Game {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        Hero hero = new Hero();

        System.out.println("hero = " + hero);

        applyDamage(enemy, hero);

        System.out.println("hero = " + hero);
    }

    public static void applyDamage(Attackable attackable, Damageable damagable) {
        damagable.applyDamage(attackable.getDamage());
    }
}
