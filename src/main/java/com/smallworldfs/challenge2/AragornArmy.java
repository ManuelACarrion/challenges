package com.smallworldfs.challenge2;

public class AragornArmy extends Army {
    public AragornArmy(int numPelosos, int numSurenios, int numEnanos, int numNumenoreanos, int numElfos) {
        addPelosos(numPelosos);
        addSurenios(numSurenios);
        addEnanos(numEnanos);
        addNumenoreanos(numNumenoreanos);
        addElfos(numElfos);
    }

    public void addPelosos(int amount) {
        addSoldiers(SoldierType.PELOSO, amount);
    }
    public void addSurenios(int amount) {
        addSoldiers(SoldierType.SURENIO_BUENO, amount);
    }
    public void addEnanos(int amount) {
        addSoldiers(SoldierType.ENANO, amount);
    }
    public void addNumenoreanos(int amount) {
        addSoldiers(SoldierType.NUMENOREANO, amount);
    }
    public void addElfos(int amount) {
        addSoldiers(SoldierType.ELFO, amount);
    }
}