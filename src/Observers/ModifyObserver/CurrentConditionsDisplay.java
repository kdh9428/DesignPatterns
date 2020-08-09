package Observers.ModifyObserver;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :"+ temperature + "F degrees and "+humidity+"% humidity");

    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
