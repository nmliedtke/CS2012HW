import java.util.GregorianCalendar;

public class DailyWeatherReport {
	private GregorianCalendar date;
	private int lowTemp;
	private int highTemp;
	
	DailyWeatherReport(GregorianCalendar date, int lowTemp, int highTemp){
		this.date = date;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
		}
	
	public GregorianCalendar getDate() {
		return this.date;
	}
	
	public int getLowTemp() {
		return this.lowTemp;
	}
	
	public int getHighTemp() {
		return this.highTemp;
	}
}
