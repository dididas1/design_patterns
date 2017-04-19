package design_patterns.mp3;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider{
	private Calendar cal;
	
	public FakeTimeProvider() {
		cal= Calendar.getInstance();
	}
	public FakeTimeProvider(int hours){
		this();
		setHours(hours);
	}
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
