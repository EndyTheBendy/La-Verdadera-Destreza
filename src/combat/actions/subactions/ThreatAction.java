package combat.actions.subactions;

import combat.defs.*;

public class ThreatAction extends SubAction {

    private Stance threat;
    private Distance[] ranges;

    public ThreatAction(Stance threat, Distance[] ranges) {
        this.threat = threat;
        this.ranges = ranges;
    }

    public Stance getThreat() { return this.threat; }
    public Distance[] getRanges() {return this.ranges; }

}