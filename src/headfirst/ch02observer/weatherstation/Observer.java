package headfirst.ch02observer.weatherstation;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
