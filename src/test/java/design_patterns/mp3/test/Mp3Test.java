package design_patterns.mp3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import design_patterns.mp3.FakeTimeProvider;
import design_patterns.mp3.TimeProvider;
import design_patterns.mp3.TimeReminder;

public class Mp3Test {

	@Test
	public void test() {
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		TimeReminder tr= new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
		
	}

}
