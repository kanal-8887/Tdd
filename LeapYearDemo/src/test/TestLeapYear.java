package test;

import org.junit.Assert;
import org.junit.Test;

import main.LeapYearValidator;

public class TestLeapYear {
	LeapYearValidator leapYear = new LeapYearValidator();

	@Test
	public void testLeapYear() {

		Assert.assertEquals(true, leapYear.isLeapYear(2000));
	}

	@Test
	public void testLeaveYear1700() {
		Assert.assertEquals(false, leapYear.isLeapYear(1700));
	}

	@Test
	public void testLeaveYear1800() {
		Assert.assertEquals(false, leapYear.isLeapYear(1800));
	}

	@Test
	public void testLeaveYear1900() {
		Assert.assertEquals(false, leapYear.isLeapYear(1900));
	}

	@Test
	public void testLeaveYear() {
		Assert.assertEquals(false, leapYear.isLeapYear(2100));
	}

	@Test
	public void testLeaveYear2008() {
		Assert.assertEquals(false, leapYear.isLeapYear(2008));
	}

	@Test
	public void testLeaveYear2012() {
		Assert.assertEquals(false, leapYear.isLeapYear(2012));
	}

	@Test
	public void testLeaveYear2016() {
		Assert.assertEquals(false, leapYear.isLeapYear(2016));
	}

	@Test
	public void testLeaveYearDividdBy2017() {
		Assert.assertEquals(false, leapYear.isLeapYear(2017));
	}

	@Test
	public void testLeaveYearDividdBy2018() {
		Assert.assertEquals(false, leapYear.isLeapYear(2018));
	}

	@Test
	public void testLeaveYearDividdBy2019() {
		Assert.assertEquals(false, leapYear.isLeapYear(2019));
	}
}
