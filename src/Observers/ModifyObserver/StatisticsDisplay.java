package Observers.ModifyObserver;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float tempSum = 0;
    private float maxTemp = 0;
    private float minTemp = 200;
    private int numReadings;


    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (maxTemp < temp) {
            maxTemp = temp;
        }

        if (minTemp > temp) {
            minTemp = temp;
        }
        display();
    }
}
