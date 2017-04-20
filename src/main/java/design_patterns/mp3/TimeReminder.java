package design_patterns.mp3;

import java.util.Calendar;

public class TimeReminder{

	private Mp3 m;
	private TimeProvider tProv;



	public void settProv(TimeProvider tProv) {
		this.tProv = tProv;
	}



	public void reminder(){
		//	Calendar cal = Calendar.getInstance();]
		//	int hour = cal.get(Calendar.HOUR_OF_DAY);
		m= new Mp3();
		int hour = tProv.getTime();
		if(hour >=22){
			m.playSong();
		}
	}
}
