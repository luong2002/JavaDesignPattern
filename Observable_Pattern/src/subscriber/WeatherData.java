package subscriber;

import java.util.ArrayList;

public class WeatherData implements Observable {

	private ArrayList<Observer> observer;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
		observer = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		int i = observer.indexOf(o);
		if( i >= 0)		// indexOf() can return -1
			observer.remove(i);
	}

	public void changeData( float temp, float hum, float press ) {
		temperature = temp;
		humidity = hum;
		pressure = press;
		notifyObserver();
	}
	
	@Override
	public void notifyObserver() {
		for( Observer o : observer ) {
			o.update( temperature, humidity, pressure );
		}
	}

}
