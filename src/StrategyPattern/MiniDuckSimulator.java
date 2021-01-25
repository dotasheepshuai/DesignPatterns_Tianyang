package StrategyPattern;

import StrategyPattern.BehaviourImpl.FlyNoWay;
import StrategyPattern.BehaviourImpl.MuteQuack;
import StrategyPattern.Duck.Duck;
import StrategyPattern.DuckImpl.MallardDuck;


/**
 * The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 *
 * Design Principle 1: Identify the aspects of your application that vary and separate them from what stays the same
 * Design Principle 2: Program to an interface, not an implementation.
 * Design Principle 3: Favor composition over inheritance.
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        final Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.fly();
        mallard.quack();
    }
}