package StatePattern.StateMachine;

import java.util.Random;

class HasQuarterState extends State {
    private GumballMachine gumballMachine;
    private final Random randomWinner = new Random(System.currentTimeMillis());

    HasQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void ejectQuarter() {
        System.out.println("You ejected a quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    void turnCrank() {
        System.out.println("You turned...");
        final int winner = randomWinner.nextInt(10);
        if ((winner > 6) && (gumballMachine.getGumCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}