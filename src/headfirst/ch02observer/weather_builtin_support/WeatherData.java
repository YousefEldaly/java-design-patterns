package headfirst.ch02observer.weather_builtin_support;
import java.util.Observable;
// change1: we imported the Observerable class and the Observer interface


// change2: we are subclassing the Observable
public class WeatherData extends Observable{
    private float temprature;
    private float humidity;
    private  float pressure;

    //change3: we don't need to keep track of our observers anymore or mange
    //their registration or removal (The super class will handle that)


    // change4: no need to create a data structure in the constructor
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        //change5: call setChanged to set the chaged flag true to notify the observers
        notifyObservers();
    }

    public void setMeasurements(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temprature;
    }


    // getters to use a pull instead of push style
    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}