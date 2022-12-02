package com.smallworldfs.challenge2;

public enum SoldierType {
    PELOSO(1),
    SURENIO_BUENO(2),
    ENANO(3),
    NUMENOREANO(4),
    ELFO(5),

    SURENIO_MALO(2),
    ORCO(2),
    GOBLIN(2),
    HUARGO(3),
    TROLL(5);

    private final int attack;

    SoldierType(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
}