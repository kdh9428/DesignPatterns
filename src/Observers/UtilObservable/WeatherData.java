package Observers.UtilObservable;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private WeatherDto weatherDto = new WeatherDto();

    public void measurementsChanged() {
        setChanged();
        notifyObservers(weatherDto);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        weatherDto.setTemperature(temperature);
        weatherDto.setHumidity(humidity);
        weatherDto.setPressure(pressure);
        measurementsChanged();
    }

//    public float getTemperature() {
//        return temperature;
//    }
//
//    public float getHumidity() {
//        return humidity;
//    }
//
//    public float getPressure() {
//        return pressure;
//    }
}
