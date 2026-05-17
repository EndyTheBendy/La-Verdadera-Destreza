package weapons;

import combat.actions.Action;
import combat.defs.*;

public abstract class Weapon {

    private Action attackHighLight;
    private Action attackHighHeavy;
    private Action attackLowLight;
    private Action attackLowHeavy;
    private Action parry;

    public Weapon(Stance stance) {
        updateAttacks(stance);
    }

    //setters;
    public void setAttackHighLight(Action input) { this.attackHighLight = input; }
    public void setAttackHighHeavy(Action input) { this.attackHighHeavy = input; }
    public void setAttackLowLight(Action input)  { this.attackLowLight = input;  }
    public void setAttackLowHeavy(Action input)  { this.attackLowHeavy = input;  }
    public void setParry(Action input)           { this.parry = input; }

    public abstract void updateAttacks(Stance stance); //updates all of the attacks based on a given stance;

    //getters -- also double as attacks;
    public Action getAttackHighLight() { return this.attackHighLight; }
    public Action getAttackHighHeavy() { return this.attackHighHeavy; }
    public Action getAttackLowLight()  { return this.attackLowLight;  }
    public Action getAttackLowHeavy()  { return this.attackLowHeavy;  }
    public Action getParry()           { return this.parry;           }

    //public Attack getUndefinedAttack() { return UNDEFINED_ATTACK;     }
}
