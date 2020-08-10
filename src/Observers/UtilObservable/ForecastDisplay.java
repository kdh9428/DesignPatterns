package Observers.UtilObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {

        System.out.print("날씨 예보 :");
        if (currentPressure > lastPressure){
            System.out.println("날씨가 맑아지겠습니다.");
        }else if (currentPressure == lastPressure){
            System.out.println("같은 날씨");
        }else if (currentPressure < lastPressure){
            System.out.println("온도가 더 낮고, 비가 올 수 있습니다.");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherDto){
            WeatherDto weatherDto = (WeatherDto) arg;
           this.lastPressure = this.currentPressure;
           this.currentPressure = weatherDto.getPressure();
           display();
        }
    }
}
