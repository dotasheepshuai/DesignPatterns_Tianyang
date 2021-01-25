package StrategyPattern.BehaviourImpl;

import StrategyPattern.Behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
