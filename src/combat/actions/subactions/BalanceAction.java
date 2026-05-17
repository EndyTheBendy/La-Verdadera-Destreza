package combat.actions.subactions;

public class BalanceAction extends SubAction {
    
    private boolean restoresBalance;
    private boolean isStrong;

    public BalanceAction(boolean restoresBalance, boolean isStrong) {
        this.restoresBalance = restoresBalance;
        this.isStrong = isStrong;
    }

    boolean restoreBalance() { return this.restoresBalance; }
    boolean isStrong() { return this.isStrong; }

}
