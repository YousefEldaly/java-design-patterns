package headfirst.ch02observer.weatherbuiltinsupport;

import headfirst.ch02observer.weatherstation.DisplayElement;

import java.util.Observable;
import java.util.Observer;


//change1: implemented Observable class and Observer interface


// change2: we are now implementing the built-in Observer instead of our Observer
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    // change3: the constructor now takes an Observable and we use this to add
    //the current confitions object as an Observer

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    // change4: takes and Observable and an Object as data

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
