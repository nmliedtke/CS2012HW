import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class Examples {

	Time T1 = new Time(2, 40);
	Time T2 = new Time(16, 10);
	
	GregorianCalendar date1 = new GregorianCalendar(2017, 1, 1);
	GregorianCalendar date2 = new GregorianCalendar(2017, 1, 10);
	GregorianCalendar date3 = new GregorianCalendar(2016, 1, 15);
	GregorianCalendar date4 = new GregorianCalendar(2017, 2, 10);
	GregorianCalendar date5 = new GregorianCalendar(2017, 1, 7);

	
	Reading R1 = new Reading(T1, 20);
	Reading R2 = new Reading(T1, 90);
	Reading R3 = new Reading(T2, -10);
	Reading R4 = new Reading(T2, 50);
	
	LinkedList<Reading> RL1 = new LinkedList<Reading>();

	
	DailyWeatherReport D1 = new DailyWeatherReport(date1, -10, 90);
	DailyWeatherReport D2 = new DailyWeatherReport(date2, 50, 50);
	DailyWeatherReport D3 = new DailyWeatherReport(date3, 20, 50);
	DailyWeatherReport D4 = new DailyWeatherReport(date4, -10, 20);
	DailyWeatherReport D5 = new DailyWeatherReport(date5, -10, 90);

	LinkedList<DailyWeatherReport> L1 = new LinkedList<DailyWeatherReport>();
	LinkedList<DailyWeatherReport> L2 = new LinkedList<DailyWeatherReport>();
	LinkedList<DailyWeatherReport> L3 = new LinkedList<DailyWeatherReport>();

	IReadings I1 = new ReportList(L1);
	IReadings I2 = new ReportList(L2);
	IReadings I3 = new ReportList(L3);

	WeatherMonitor W1 = new WeatherMonitor(I1);
	WeatherMonitor W2 = new WeatherMonitor(I2);
	WeatherMonitor W3 = new WeatherMonitor(I3);


	
	Examples(){
		L1.add(D1);
		L1.add(D2);
		L1.add(D3);
		L1.add(D4);
		
		L2.add(D1);
		L2.add(D2);
		L2.add(D3);
		L2.add(D4);
		L2.add(D5);
		
		RL1.add(R1);
		RL1.add(R2);
		RL1.add(R3);
		RL1.add(R4);

	}
	
	@Test
	public void checkAverageHigh() {
		assertEquals(W1.averageHighForMonth(1, 2017), 70, 0.1);
		assertEquals(W1.averageHighForMonth(2, 2017), 20, 0.1);
		assertEquals(W1.averageHighForMonth(1, 2016), 50, 0.1);
		assertEquals(W1.averageHighForMonth(3, 2018), -999, 0.1);
	}
	
	@Test
	public void checkAverageLow() {
		assertEquals(W1.averageLowForMonth(1, 2017), 20, 0.1);
		assertEquals(W1.averageLowForMonth(2, 2017), -10, 0.1);
		assertEquals(W1.averageLowForMonth(1, 2016), 20, 0.1);
		assertEquals(W1.averageLowForMonth(3, 2018), 999, 0.1);
	}
	
	@Test
	public void checkAddDailyReport() {
		W3.addDailyReport(date5, RL1);
		assertFalse(L3.isEmpty());
	}
	
	
}
