package StatePattern.StateMachine;

class WinnerState extends State {
    private GumballMachine gumballMachine;

    WinnerState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void dispense() {
        gumballMachine.releaseGum();
        if (gumballMachine.getGumCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseGum();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.getGumCount() == 0) {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }
}
