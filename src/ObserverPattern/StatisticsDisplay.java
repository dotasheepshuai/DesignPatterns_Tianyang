package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private int a;
    private int b;
    private int c;

    public StatisticsDisplay(WeatherData weatherData) {
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
        System.out.format("StatisticsDisplay: %s, %s, %s", a, b, c);
    }
}
