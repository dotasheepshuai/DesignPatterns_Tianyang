package ObserverPattern;

/**
 * Defines a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically
 *
 * Design Principle 4: Strive for loosely coupled designs between objects that interact
 */
public class WeatherStation {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
        weatherData.measurementsChanged();

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.measurementsChanged();
    }
}
