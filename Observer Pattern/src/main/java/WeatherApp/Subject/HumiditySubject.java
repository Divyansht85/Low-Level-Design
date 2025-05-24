package WeatherApp.Subject;

import WeatherApp.Data;
import WeatherApp.Observer.ObserverInterface;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class HumiditySubject implements SubjectInterface {
    int humidity = 0;
    List<ObserverInterface> observerList;
    public HumiditySubject() {
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
    public void getNewData(int humidity)
    {
        if(humidity!=this.humidity){
            this.humidity=humidity;
            notifyObservers();
        }
    }
    @Override
    public Data pullData(){
        return new Data("Humidity",humidity);
    }
}
