package LabAssignments;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToFahrenheitTest {

	@Test
	public void test() {
		Temperature test = new Temperature();
		test.setCelsius(32.0);
		double output = test.toFahrenheit();
		assertEquals(89.6, output, 0.00001);
	}

}
