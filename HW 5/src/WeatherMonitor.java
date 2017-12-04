import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	
	WeatherMonitor(){}
	
	double averageHighForMonth(int month, int year){
		return 5.0;
	}
	
	double averageLowForMonth(int month, int year) {
		return 5.0;
	}

	DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Readings> readings) {
		return new DailyWeatherReport(date, 1, 2);
	}
}
