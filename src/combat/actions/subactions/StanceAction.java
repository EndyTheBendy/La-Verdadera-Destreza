package combat.actions.subactions;

import combat.defs.*;

public class StanceAction extends SubAction {
    
    private Stance stance;

    public static final StanceAction HIGH_INNER_STANCE = new StanceAction(Stance.HIGH_INNER);
    public static final StanceAction HIGH_OUTER_STANCE = new StanceAction(Stance.HIGH_OUTER);
    public static final StanceAction LOW_INNER_STANCE = new StanceAction(Stance.LOW_INNER);
    public static final StanceAction LOW_OUTER_STANCE = new StanceAction(Stance.LOW_OUTER);

    public StanceAction(Stance stance) {
        this.stance = stance;
    }

    public Stance getStance() { return this.stance; }

}
