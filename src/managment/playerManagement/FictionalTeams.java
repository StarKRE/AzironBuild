package managment.playerManagement;

import bonus.bonuses.Bonus;
import bonus.deck.fictionalDecks.FictionalDecks;
import heroes.abstractHero.hero.AHero;
import heroes.lv.builder.LVBuilder;
import heroes.orcBash.builder.OrcBashBuilder;
import managment.profileManagement.Profile;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Test factory imitates players in match.
 * Temporary test clazz.
 */

public final class FictionalTeams {

    @NotNull
    public static ATeam createLeft(){

        final Profile joysProfile = new Profile("Joe", 0, null, null, null
                , null, null, 0, null);
        final Profile goresProfile = new Profile("Gore", 0, null, null, null
                , null, null, 0, null);

        final AHero joysDevourer = new OrcBashBuilder().buildHero();
        final AHero goresOrcBash = new OrcBashBuilder().buildHero();

        final Player joysPlayer = new Player(joysProfile, joysDevourer);
        final Player goresPlayer = new Player(goresProfile, goresOrcBash);

        return new ATeam(goresPlayer, joysPlayer);
    }

    @NotNull
    public static ATeam createRight(){
        final Profile mikesProfile = new Profile("Mike", 0, null, null, null
                , null
                , null, null, null);
        final Profile kevinProfile = new Profile("Kevin", 0, null, null, null
                , null
                , null, null, null);

        final AHero mikesLordVampire = new LVBuilder().buildHero();
        final AHero kevinOrcBash = new LVBuilder().buildHero();

        final Player mikesPlayer = new Player(mikesProfile, mikesLordVampire);
        final Player kevinPlayer = new Player(kevinProfile, kevinOrcBash);

        return new ATeam(mikesPlayer, kevinPlayer);
    }
}
