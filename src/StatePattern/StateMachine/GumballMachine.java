package StatePattern.StateMachine;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    private State soldOutState;

    private int gumCount;
    private State currentState;

    public GumballMachine(final int gumCount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        soldOutState = new SoldOutState(this);

        this.gumCount = gumCount;
        if (gumCount > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }
    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }
    public void refill() {
        gumCount += 10;
        currentState.refill();
    }

    State getNoQuarterState() {
        return noQuarterState;
    }
    State getHasQuarterState() {
        return hasQuarterState;
    }
    State getWinnerState() {
        return winnerState;
    }
    State getSoldState() {
        return soldState;
    }
    State getSoldOutState() {
        return soldOutState;
    }
    void setState(final State state) {
        currentState = state;
    }
    int getGumCount() {
        return gumCount;
    }
    void releaseGum() {
        if (gumCount > 0) {
            System.out.println("A gumball comes rolling out the slot...");
            gumCount--;
        }
    }

    public String toString() {
        return "GumballMachine has " + gumCount + " gums";
    }
}
