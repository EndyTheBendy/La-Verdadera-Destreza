package combat.actions;

import combat.actions.subactions.*;
import java.util.List;

public class Action {

    private final String name;                      //attack name;
    private List<SubAction> subActions;             //component sub-actions;
    private boolean requiresBalance;                //does it require balance from the Fencer?

    public Action(String name, List<SubAction> subActions, boolean requiresBalance) {
        this.name = name;
        this.subActions = subActions;
        this.requiresBalance = requiresBalance;
    }

    public  String              getName()           { return this.name; }
    public  List<SubAction>     getSubActions()     { return this.subActions; }
    public  boolean             requiresBalance()   { return this.requiresBalance; }

}