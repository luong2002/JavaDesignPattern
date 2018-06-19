package api;

public class Tester {
	public static void main(String[] args) {
		WeatherData weatherStation = new WeatherData();
		CurrentConditionDisplay observer1 = new CurrentConditionDisplay( weatherStation );
		ForecastDisplay observer2 = new ForecastDisplay( weatherStation );
		StatisticsDisplay observer3 = new StatisticsDisplay( weatherStation );
		weatherStation.changeData(4.3f, 1.2f, 2.1f);
		
		System.out.println( "CurrentCondition has unsubscribe..." );
		observer1.unsubscribeMe();
		
		System.out.println( "Forecast has unsubscribe..." );
		observer2.unsubscribeMe();
		weatherStation.changeData(4.3f, 1.12f, 2.1f);
		
		
			
		
	}
}
