package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        this.health = 50;
        this.damage = 20;
        this.isArmored = false;
    }

    public int getHitPoints() {
        return health;
    }
}
