package StatePattern;

import StatePattern.StateMachine.GumballMachine;

/**
 * The State Pattern - allows an object to alter its behavior when tis internal state changes. The object will
 * appear to change its class
 */
public class GumballMachineTestDrive {
    public static void main(final String[] args) {
        final GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
