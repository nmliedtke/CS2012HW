import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	
	LinkedList<DailyWeatherReport> dailyReports;
	
	WeatherMonitor(LinkedList<DailyWeatherReport> dailyReports){
		this.dailyReports = dailyReports;
	}
	
	int averageHighForMonth(int month, int year){
		int monthHigh = -999;
		for(DailyWeatherReport r: this.dailyReports) {
			if(r.date.get(GregorianCalendar.YEAR) == year){
				if(r.date.get(GregorianCalendar.MONTH) == month) {
					if(r.highTemp > monthHigh) {
						monthHigh = r.highTemp;
					}
				}
			}
		}
		return monthHigh;
	}
	
	double averageLowForMonth(int month, int year) {
		int monthLow = 999;
		for(DailyWeatherReport r: this.dailyReports) {
			if(r.date.get(GregorianCalendar.YEAR) == year){
				if(r.date.get(GregorianCalendar.MONTH) == month) {
					if(r.lowTemp < monthLow) {
						monthLow = r.lowTemp;
					}
				}
			}
		}
		return monthLow;
	}

	void addDailyReport(GregorianCalendar date, LinkedList<Readings> readings) {
		int dayHigh = -999;
		int dayLow = 999;
		for(Readings r: readings) {
			if(r.temperature > dayHigh) {
				dayHigh = r.temperature;
			}
			else if(r.temperature < dayLow) {
				dayLow = r.temperature;
			}
		}
		
		this.dailyReports.add(new DailyWeatherReport(date, dayLow, dayHigh));
	}
}
