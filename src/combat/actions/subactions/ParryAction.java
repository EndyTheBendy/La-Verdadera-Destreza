package combat.actions.subactions;

import combat.defs.*;

public class ParryAction extends SubAction {
    
    private Stance parry;
    private Distance[] ranges;

    public ParryAction(Stance parry, Distance[] ranges) {
        this.parry = parry;
        this.ranges = ranges;
    }

    public Stance getParry() { return this.parry; }
    public Distance[] getRanges() {return this.ranges; }

}
