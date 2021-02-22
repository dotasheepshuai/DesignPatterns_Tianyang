package StatePattern.StateMachine;

class SoldState extends State {
    private GumballMachine gumballMachine;

    SoldState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void dispense() {
        gumballMachine.releaseGum();
        if (gumballMachine.getGumCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
