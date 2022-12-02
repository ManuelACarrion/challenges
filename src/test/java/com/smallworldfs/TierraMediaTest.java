package com.smallworldfs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.smallworldfs.challenge2.AragornArmy;
import com.smallworldfs.challenge2.BattleResult;
import com.smallworldfs.challenge2.ChallengeTierraMedia;
import com.smallworldfs.challenge2.SauronArmy;
import org.junit.jupiter.api.Test;

public class TierraMediaTest {

    private final ChallengeTierraMedia challengeTierraMedia = new ChallengeTierraMedia();

    @Test
    void test_1_troll_wins_3_pelosos() {
        AragornArmy aragornArmy = new AragornArmy(3, 0, 0, 0, 0);
        SauronArmy sauronArmy = new SauronArmy(0, 0, 0, 0, 1);
        assertEquals(challengeTierraMedia.whoWins(aragornArmy, sauronArmy), BattleResult.TEAM_SAURON_WINS);
    }

    @Test
    void test_1_troll_tie_5_pelosos() {
        AragornArmy aragornArmy = new AragornArmy(5, 0, 0, 0, 0);
        SauronArmy sauronArmy = new SauronArmy(0, 0, 0, 0, 1);
        assertEquals(challengeTierraMedia.whoWins(aragornArmy, sauronArmy), BattleResult.TIE);
    }

    @Test
    void test_1_soldier_of_each_type_in_each_army_aragorn_wins() {
        AragornArmy aragornArmy = new AragornArmy(1, 1, 1, 1, 1);
        SauronArmy sauronArmy = new SauronArmy(1, 1, 1, 1, 1);
        assertEquals(challengeTierraMedia.whoWins(aragornArmy, sauronArmy), BattleResult.TEAM_ARAGORN_WINS);
    }
}