import java.util.GregorianCalendar;

public class DailyWeatherReport {
	GregorianCalendar date;
	int lowTemp;
	int highTemp;
	
	DailyWeatherReport(GregorianCalendar date, int lowTemp, int highTemp){
		this.date = date;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
		}
}
