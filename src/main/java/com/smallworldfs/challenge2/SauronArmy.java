package com.smallworldfs.challenge2;

public class SauronArmy extends Army {
    public SauronArmy(int numSurenios, int numOrcos, int numGoblins, int numHuargos, int numTrolls) {
        addSurenios(numSurenios);
        addOrcos(numOrcos);
        addGoblins(numGoblins);
        addHuargos(numHuargos);
        addTrolls(numTrolls);
    }

    public void addSurenios(int amount) {
        addSoldiers(SoldierType.SURENIO_MALO, amount);
    }
    public void addOrcos(int amount) {
        addSoldiers(SoldierType.ORCO, amount);
    }
    public void addGoblins(int amount) {
        addSoldiers(SoldierType.GOBLIN, amount);
    }
    public void addHuargos(int amount) {
        addSoldiers(SoldierType.HUARGO, amount);
    }
    public void addTrolls(int amount) {
        addSoldiers(SoldierType.TROLL, amount);
    }
}