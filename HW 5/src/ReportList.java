import java.util.LinkedList;

public class ReportList implements IReadings{
	private LinkedList<DailyWeatherReport> reports;
	
	ReportList(LinkedList<DailyWeatherReport> reports){
		this.reports = reports;
	}
	
	public LinkedList<DailyWeatherReport> getList(){
		return this.reports;
	}

	public void addReport(DailyWeatherReport report){
		reports.add(report);
	}
}
