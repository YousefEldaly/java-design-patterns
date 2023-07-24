package headfirst.ch02observer.weather_station;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temprature
            + "F degrees and " + humidity + "% humidity");
    }
}
