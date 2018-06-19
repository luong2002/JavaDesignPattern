package subscriber;

public class Tester {
	public static void main(String[] args) {
		WeatherData station = new WeatherData();
		Observer observer1 = new CurrentConditionDisplay( station );
		Observer observer2 = new StatisticsDisplay( station );
		Observer observer3 = new ForecastDisplay( station );
		
		station.changeData( 2.1f, 4.3f, 6.7f);
		
		station.changeData( 2.1f, 14.3f, 6.7f);

		station.changeData( 12.1f, 14.3f, 6.7f);		
		
	}
}
