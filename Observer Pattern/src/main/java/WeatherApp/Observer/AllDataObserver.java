package WeatherApp.Observer;

import WeatherApp.Data;
import WeatherApp.Subject.SubjectInterface;

import java.util.Observer;

public class AllDataObserver implements ObserverInterface {
    @Override
    public void update(SubjectInterface subject) {
        Data data=subject.pullData();
        System.out.println(data.toString());
    }
}
