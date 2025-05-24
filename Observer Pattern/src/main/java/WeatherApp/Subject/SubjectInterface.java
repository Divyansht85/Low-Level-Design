package WeatherApp.Subject;

import WeatherApp.Data;
import WeatherApp.Observer.ObserverInterface;

public interface SubjectInterface {
    public void  register(ObserverInterface observer);
    public void unregister(ObserverInterface observer);
    public void notifyObservers();
    public void getNewData(int temperature);
    public Data pullData();
}
