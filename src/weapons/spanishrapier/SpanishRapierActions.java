package weapons.spanishrapier;

import combat.actions.subactions.*;
import combat.actions.*;
import combat.defs.*;
import java.util.List;

public final class SpanishRapierActions {
    
    private SpanishRapierActions() {}   //no makesies;

    public static final Action TAJO_DESCENDENTE =
    // natural, quick downwards cut,
    // hits quarte,
    // starts from upper right, goes to lower left,
    // requires balance, not strong.
        new Action (
            /*name:*/ "tajo descendente",

            /*attack properties*/
            List.of(
                new ThreatAction (
                    Stance.HIGH_INNER,
                    new Distance[]{
                        Distance.CLOSE,
                        Distance.MID
                    }
                ),

                new ParryAction(
                    Stance.HIGH_OUTER,
                    new Distance[] {
                        Distance.CLOSE,
                        Distance.MID
                    }
                ),

                new StanceAction(
                    Stance.LOW_INNER
                )
            ),

            /*requiresBalance:*/ true
        );

}