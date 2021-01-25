package StrategyPattern.BehaviourImpl;

import StrategyPattern.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute quack!");
    }
}
