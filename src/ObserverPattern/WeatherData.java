package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public int getTemperature() {
        return 1;
    }

    public int getHumidity() {
        return 2;
    }

    public int getPressure() {
        return 3;
    }

    public void measurementsChanged() {
        this.notifyObserver();
    }
}
