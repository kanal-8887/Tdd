package test;

import org.junit.Assert;
import org.junit.Test;

import main.LeapYearValidator;

public class TestLeapYear {

	@Test
	public void TestLeapYear(){
		LeapYearValidator leapYear = new LeapYearValidator();
		if (leapYear.isLeapYear(1990)) {
			Assert.assertEquals(true, leapYear.isLeapYear(1990));
		}
		Assert.assertEquals(true, leapYear.isLeapYear(2000));
	}
}
