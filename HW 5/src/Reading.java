
public class Reading {
	private Time time;
	private int temperature;
	
	Reading(Time time, int temperature){
		this.time = time;
		this.temperature = temperature;
	}
	
	public Time getTime() {
		return this.time;
	}
	
	public int getTemperature() {
		return this.temperature;
	}
}
