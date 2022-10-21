package com.smallworldfs.challenge2;

public class ChallengeTierraMedia {
    /**
     * Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales a Sauron contra otras que no quieren que el mal reine sobre sus tierras.
     * Cada raza tiene asociado un "valor" entre 1 y 5:
     * 	- Razas good: Pelosos (1), Sureños buenos (2), Enanos (3), Númenóreanos (4), Elfos (5)
     * 	- Razas bad: Sureños malos (2), Orcos (2), Goblins (2), Huargos (3), Trolls (5)
     * Crea un programa que calcule el resultado de la batalla entre los 2 tipos de ejércitos:
     * 	- El resultado puede ser que gane el bien, el mal, o exista un empate. Dependiendo de la suma del valor del ejército y el número de integrantes.
     * 	- Cada ejército puede estar compuesto por un número de integrantes variable de cada raza.
     * 	- Tienes total libertad para modelar los datos del ejercicio.
     * Ej: 1 Peloso pierde contra 1 Orco, 2 Pelosos empatan contra 1 Orco, 3 Pelosos ganan a 1 Orco.
     */
    public BattleResult whoWins(AragornArmy aragornArmy, SauronArmy sauronArmy) {
        if (aragornArmy.getTotalAttack() == sauronArmy.getTotalAttack()) {
            return BattleResult.TIE;
        } else if (aragornArmy.getTotalAttack() > sauronArmy.getTotalAttack()) {
            return BattleResult.TEAM_ARAGORN_WINS;
        } else {
            return BattleResult.TEAM_SAURON_WINS;
        }
    }
}