package LabAssignments;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToCelsiusTest {
	
	@Test
	public void test() {
		Temperature test = new Temperature();
		test.setFahrenheit(212);
		double output = test.toCelsius();
		assertEquals(100, output, 0.00001);
	}
	
}
