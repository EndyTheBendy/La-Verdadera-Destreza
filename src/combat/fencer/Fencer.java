package combat.fencer;
import weapons.*;
import combat.defs.*;

public class Fencer {

    private boolean isUnbalanced;           //an unbalanced fencer cannot do certain moves and is vulnerable in the atajo;
    private boolean isDead;                 //a dead fencer. uh. well;

    private Stance currentStance;           //current stance;
    private Movement movementIntent;        //does the fencer want to advance, retreat, or will they stay put?

    private Weapon mainHand;                //mainhand weapon;

    public Fencer(Weapon mainHand, Stance currentStance) {

        this.isUnbalanced = false;
        this.isDead = false;        
        this.currentStance = currentStance;
        this.movementIntent = Movement.STAY;
        this.mainHand = mainHand;
        this.mainHand.updateAttacks(currentStance);

    }

    //setters;
    public void setStance(Stance newStance) {
        currentStance = newStance;
        mainHand.updateAttacks(currentStance);  //changing the fencer's stance also needs to update the weapon;
    }
    public void setMovementIntent(Movement movementIntent) { this.movementIntent = movementIntent; }
    public void setUnbalanced(boolean isUnbalanced)        { this.isUnbalanced = isUnbalanced; }
    public void setDead(boolean isDead)                    { this.isDead = isDead; }
    public void setMainHand(Weapon mainHand) {
        this.mainHand = mainHand;
        this.mainHand.updateAttacks(currentStance); //changing the fencer's weapon also needs to update its moveset to the appropriate stance's;
    }

    //getters;
    public boolean  isUnbalanced()      { return this.isUnbalanced; }
    public boolean  isDead()            { return this.isDead; }
    public Stance   getCurrentStance()  { return this.currentStance; }
    public Movement getMovementIntent() { return this.movementIntent; }
    //no weapon getter for now cuz that sounds wholly unnecessary;
}