package StrategyPattern.DuckImpl;

import StrategyPattern.BehaviourImpl.FlyWithWings;
import StrategyPattern.BehaviourImpl.Quack;
import StrategyPattern.Duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Display!");
    }
}
