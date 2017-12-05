import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor  {
	
	private IReadings dailyReports;
	
	WeatherMonitor(IReadings dailyReports){
		this.dailyReports = dailyReports;
	}
	
	double averageHighForMonth(int month, int year){
		int num = 0;
		int total = 0;
		for(DailyWeatherReport r: this.dailyReports.getList()) {
			if(r.getDate().get(GregorianCalendar.YEAR) == year){
				if(r.getDate().get(GregorianCalendar.MONTH) == month) {
					total = total + r.getHighTemp();
					num++;
				}
			}
		}
		if(num == 0) {
			return -999;
		}
		else {
			return total / num;
		}
	}
	
	double averageLowForMonth(int month, int year) {
		int num = 0;
		int total = 0;
		for(DailyWeatherReport r: this.dailyReports.getList()) {
			if(r.getDate().get(GregorianCalendar.YEAR) == year){
				if(r.getDate().get(GregorianCalendar.MONTH) == month) {
						total = total + r.getLowTemp();
						num++;
				}
			}
		}
		if(num == 0) {
			return 999;
		}
		else {
			return total / num;
		}
	}

	void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		int dayHigh = -999;
		int dayLow = 999;
		for(Reading r: readings) {
			if(r.getTemperature()> dayHigh) {
				dayHigh = r.getTemperature();
			}
			else if(r.getTemperature() < dayLow) {
				dayLow = r.getTemperature();
			}
		}
		this.dailyReports.addReport(new DailyWeatherReport(date, dayLow, dayHigh));
	}
	
}
