import java.util.LinkedList;

public interface IReadings {
	LinkedList<DailyWeatherReport> getList();
	public void addReport(DailyWeatherReport report);
}
