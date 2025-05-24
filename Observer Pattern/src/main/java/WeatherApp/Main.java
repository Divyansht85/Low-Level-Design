package WeatherApp;

import WeatherApp.Observer.HumidityObserver;
import WeatherApp.Observer.ObserverInterface;
import WeatherApp.Observer.TemperatureObserver;
import WeatherApp.Subject.HumiditySubject;
import WeatherApp.Subject.SubjectInterface;
import WeatherApp.Subject.TemperatureSubject;

import javax.security.auth.Subject;

public class Main {
    public static void main(String[] args) {
        SubjectInterface temperatureSubject = new TemperatureSubject();
        SubjectInterface humiditySubject = new HumiditySubject();
        ObserverInterface temperatureObserver = new TemperatureObserver();
        ObserverInterface humidityObserver = new HumidityObserver();
        ObserverInterface allDataObserver = new HumidityObserver();
        temperatureSubject.register(temperatureObserver);
        humiditySubject.register(humidityObserver);
        temperatureSubject.register(allDataObserver);
        humiditySubject.register(allDataObserver);
        temperatureSubject.getNewData(25);
        humiditySubject.getNewData(100);
    }
    }