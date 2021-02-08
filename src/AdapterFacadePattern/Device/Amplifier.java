package AdapterFacadePattern.Device;

public class Amplifier {
    public void setStreamingPlayer() {
        System.out.println("setStreamingPlayer");
    }

    public void setSurroundSound() {
        System.out.println("setSurroundSound");
    }

    public void setVolume(int volume) {
        System.out.println("setVolume to " + volume + "\n");
    }

    public void on() {
        System.out.println("amplifier on");
    }

    public void off() {
        System.out.println("amplifier off");
    }
}
