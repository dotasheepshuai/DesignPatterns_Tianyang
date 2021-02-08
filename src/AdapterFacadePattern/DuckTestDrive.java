package AdapterFacadePattern;

import AdapterFacadePattern.Adapter.TurkeyAdapter;
import AdapterFacadePattern.Duck.Duck;
import AdapterFacadePattern.Duck.MallardDuck;
import AdapterFacadePattern.Turkey.Turkey;
import AdapterFacadePattern.Turkey.WildTurkey;

/**
 * The Adapter Pattern - converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        final Duck duck = new MallardDuck();
        final Turkey turkey = new WildTurkey();
        final Duck fakeDuck = new TurkeyAdapter(turkey);

        System.out.println("\nDuck\n");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkey\n");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nFake duck\n");
        fakeDuck.quack();
        fakeDuck.fly();
    }
}
