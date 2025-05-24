package WeatherApp.Observer;

import WeatherApp.Subject.SubjectInterface;

public interface ObserverInterface {
    public void update(SubjectInterface subject);
}
