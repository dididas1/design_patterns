package design_patterns.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import design_patterns.mp3.FakeTimeProvider;
import design_patterns.mp3.RealTimeProvider;
import design_patterns.mp3.TimeProvider;
import design_patterns.mp3.TimeReminder;

public class Mp3Test {
	private static final Logger log= Logger.getLogger(Mp3Test.class);
	@Test
	public void testFakeTime() {
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		TimeReminder tr= new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
		
	}
	
	public void testRealTime() {
		TimeProvider tProvSub = new RealTimeProvider();
		TimeReminder tr= new TimeReminder();
		tr.settProv(tProvSub);
		tr.reminder();
		
	}

}
