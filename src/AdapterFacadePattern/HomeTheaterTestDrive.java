package AdapterFacadePattern;

import AdapterFacadePattern.Device.Amplifier;
import AdapterFacadePattern.Device.Projector;
import AdapterFacadePattern.Device.StreamingPlayer;
import AdapterFacadePattern.Device.Tuner;
import AdapterFacadePattern.Facade.HomeTheaterFacade;

/**
 * The Facade Pattern - provides a unified interface to a set of interfaces in a subsystem. Facade defines a
 * higher-level interface that makes the subsystem easier to use
 *
 * Design Principle: Principle of Least Knowledge: talk only to your immediate friends
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        final Amplifier amplifier = new Amplifier();
        final Tuner tuner = new Tuner();
        final StreamingPlayer streamingPlayer = new StreamingPlayer();
        final Projector projector = new Projector();
        final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, streamingPlayer, projector);

        homeTheaterFacade.watchMovie("good movie");
        homeTheaterFacade.endMovie();
    }
}
