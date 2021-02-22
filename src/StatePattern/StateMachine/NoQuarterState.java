package StatePattern.StateMachine;

class NoQuarterState extends State {
    private GumballMachine gumballMachine;

    NoQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
}
