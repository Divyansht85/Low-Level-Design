package WeatherApp.Observer;

import WeatherApp.Subject.SubjectInterface;
import WeatherApp.Data;
import javax.security.auth.Subject;
import java.util.Observer;

public class HumidityObserver implements ObserverInterface {
    @Override
    public void update(SubjectInterface subject) {
        Data data=subject.pullData();
        System.out.println(data.toString());
    }
}
