package combat.actions.subactions;

import combat.defs.*;

public class MoveAction extends SubAction {
    
    private Movement move;

    public static final MoveAction ADVANCE_MOVEMENT = new MoveAction(Movement.ADVANCE);
    public static final MoveAction RETREAT_MOVEMENT = new MoveAction(Movement.RETREAT);

    public MoveAction(Movement move) {
        this.move = move;
    }

    public Movement getMove() { return this.move; }

}
