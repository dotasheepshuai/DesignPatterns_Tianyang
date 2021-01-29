package ObserverPattern;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private int a;
    private int b;
    private int c;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.a = weatherData.getTemperature();
        this.b = weatherData.getHumidity();
        this.c = weatherData.getPressure();

        this.display();
    }

    @Override
    public void display() {
        System.out.format("ThirdPartyDisplay: %s, %s, %s", a, b, c);
    }
}
