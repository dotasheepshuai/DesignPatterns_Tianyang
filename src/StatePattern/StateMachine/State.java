package StatePattern.StateMachine;

abstract class State {
    void insertQuarter() {
        System.out.println("You cannot insertQuarter");
    }
    void ejectQuarter() {
        System.out.println("You cannot ejectQuarter");
    }
    void turnCrank() {
        System.out.println("You cannot turnCrankQuarter");
    }
    void dispense() {
        System.out.println("You cannot dispenseQuarter");
    }
    void refill() {
        System.out.println("You cannot refill");
    }
}
