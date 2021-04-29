package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int health;
    protected int damage;
    protected boolean isArmored;

    protected int doDamage() {
        return damage;
    }

    protected void sufferDamage(int damage) {
        if (isArmored) {
            health -= damage / 2;
        } else {
            health -= damage;
        }
    }

    protected int getHitPoints() {
        return health;
    }
}
