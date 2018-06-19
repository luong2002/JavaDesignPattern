package api;

import java.util.Observable;	// api
import java.util.Observer;		// api

public class ForecastDisplay implements Observer, SubscriptionBehavior {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			lastPressure = currentPressure;
			currentPressure = ((WeatherData)observable).getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void unsubscribeMe() {
		observable.deleteObserver(this);
	}
}
