package com.smallworldfs.challenge2;

import java.util.HashMap;
import java.util.Map;

public class Army {
    protected Map<SoldierType, Integer> soldiers = new HashMap<>();

    protected void addSoldiers(SoldierType soldierType, Integer amount) {
        soldiers.merge(soldierType, amount, Integer::sum);
    }
    protected int getTotalAttack() {
        return soldiers.keySet().stream().mapToInt(soldierType -> soldierType.getAttack() * soldiers.get(soldierType)).sum();
    }
}