package AdapterFacadePattern.Facade;

import AdapterFacadePattern.Device.Amplifier;
import AdapterFacadePattern.Device.Projector;
import AdapterFacadePattern.Device.StreamingPlayer;
import AdapterFacadePattern.Device.Tuner;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private StreamingPlayer streamingPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             StreamingPlayer streamingPlayer,
                             Projector projector) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie " + movie + "\n");
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...\n");
        amplifier.off();
        projector.off();
    }
}
