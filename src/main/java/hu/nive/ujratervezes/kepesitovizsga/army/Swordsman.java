package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean isShielded = true;

    public Swordsman(boolean isArmored) {
        health = 100;
        damage = 10;
        this.isArmored = isArmored;
    }

    @Override
    protected void sufferDamage(int damage) {
        if (isShielded) {
            isShielded = false;
            return;
        }
            super.sufferDamage(damage);
    }
}
