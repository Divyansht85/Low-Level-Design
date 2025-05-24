package WeatherApp.Observer;

import WeatherApp.Subject.SubjectInterface;
import WeatherApp.Data;
import java.util.Observer;

public class TemperatureObserver implements ObserverInterface {
    @Override
    public void update(SubjectInterface subject) {
        Data data=subject.pullData();
        System.out.println(data.toString());
    }
}
