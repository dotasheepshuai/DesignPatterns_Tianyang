package StrategyPattern.BehaviourImpl;

import StrategyPattern.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
