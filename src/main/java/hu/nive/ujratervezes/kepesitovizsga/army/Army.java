package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        units.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> it = units.iterator();
        while(it.hasNext()) {
            break;
        }
    }

    public int getArmyDamage() {
        int damageSum = 0;
        for (MilitaryUnit item : units) {
            damageSum += item.doDamage();
        }
        return damageSum;
    }

    public int getArmySize() {
        return units.size();
    }
}


