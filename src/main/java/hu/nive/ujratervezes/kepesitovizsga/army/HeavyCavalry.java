package hu.nive.ujratervezes.kepesitovizsga.army;

import hu.nive.ujratervezes.kepesitovizsga.army.MilitaryUnit;

public class HeavyCavalry extends MilitaryUnit {

    private int attackCounter;

    public HeavyCavalry() {
        health = 150;
        damage = 20;
        isArmored = true;
    }

    @Override
    public int doDamage() {
        if (attackCounter == 0) {
            ++attackCounter;
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}
