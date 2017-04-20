package design_patterns.test;

import org.junit.Test;

import design_patterns.strategy.Atom;
import design_patterns.strategy.Robot;
import design_patterns.strategy.TaekwonV;

public class StragegyTest {

	@Test
	public void test() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		prnRobot(taekwonV);
		prnRobot(atom);
		
	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
	}

}
