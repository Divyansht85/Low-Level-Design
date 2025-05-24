package WeatherApp.Subject;

import WeatherApp.Data;
import WeatherApp.Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSubject implements SubjectInterface{
    int temperature=0;
    List<ObserverInterface> observerList;
    public TemperatureSubject() {
        observerList = new ArrayList<ObserverInterface>();
    }
    @Override
    public void register(ObserverInterface observer) {
        observerList.add(observer);
    }
    @Override
    public void unregister(ObserverInterface observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : observerList) {
            observer.update(this);
        }
    }
    @Override
    public void getNewData(int temperature) {
        if(temperature!=this.temperature){
            this.temperature=temperature;
            notifyObservers();
        }
    }
    @Override
    public Data pullData(){
        return new Data("Temperature",temperature);
    }
}
