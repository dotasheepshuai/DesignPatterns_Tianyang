package ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private int a;
    private int b;
    private int c;

    public CurrentConditionsDisplay(WeatherData weatherData) {
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
        System.out.format("CurrentConditionsDisplay: %s, %s, %s", a, b, c);
    }
}
