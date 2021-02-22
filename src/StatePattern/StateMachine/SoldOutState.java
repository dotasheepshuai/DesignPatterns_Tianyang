package StatePattern.StateMachine;

class SoldOutState extends State {
    private GumballMachine gumballMachine;

    SoldOutState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
}
