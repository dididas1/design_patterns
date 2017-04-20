package design_patterns.mp3;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider{
	private Calendar cal;
	
	public RealTimeProvider() {
		cal= Calendar.getInstance();
	}

	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}
}
