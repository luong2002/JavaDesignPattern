package api;

// Dark side of java.util.Observable
	// it is CLASS => not program to interface but program to implementation (BAD IDEA)
	// class can only extends one class
	// violate the principle that you should favor composition over inheritance

import java.util.Observable;	// built-in api to implement Observable pattern

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// doesn't need to instantiate a place to hold the observers; it is the parent' job. 
	}
	
	public void changeData( float temp, float hum, float press) {
		temperature = temp;
		humidity = hum;
		pressure = press;
		notifyObserver();
	}
	
	public void notifyObserver() {
		// indicate the state has changed before calling notifyObservers()
		setChanged(); // 1st call this method from the API first to change the flag of changed = true
		notifyObservers();	// 2nd call of api
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
