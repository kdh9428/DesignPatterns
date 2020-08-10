package Observers.UtilObservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float tempSum = 0;
    private float maxTemp = 0;
    private float minTemp = 200;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("평균/최대/최소 온도 = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        numReadings++;

        if (o instanceof WeatherData) {

            if (arg instanceof WeatherDto) {
                WeatherDto weatherDto = (WeatherDto) arg;
                float temp = weatherDto.getTemperature();
                tempSum += temp;
                if (maxTemp < temp) {
                    maxTemp = temp;
                }

                if (minTemp > temp) {
                    minTemp = temp;
                }

                display();
            }
        }

    }
}
