import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer 
{
    void update(float temperature, float humidity);
}

// Subject interface
interface Subject 
{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// ConcreteSubject
class WeatherStation implements Subject 
{
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    @Override
    public void registerObserver(Observer o) 
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) 
    {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() 
    {
        for (Observer o : observers) 
        {
            o.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) 
    {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}

// ConcreteObserver
class CurrentConditionsDisplay implements Observer 
{
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) 
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() 
    {
        System.out.println("Current Conditions: " + temperature + "°C, " + humidity + "% humidity");
    }
}

// Client
public class ObserverPattern_Main 
{
    public static void main(String[] args) 
    {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay();
        CurrentConditionsDisplay display2 = new CurrentConditionsDisplay();

        station.registerObserver(display1);
        station.registerObserver(display2);

        station.setMeasurements(25.5f, 60f);
        station.setMeasurements(28f, 55f);
    }
}
