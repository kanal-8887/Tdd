package main;

public class LeapYearValidator {
	public boolean isLeapYear(int leapYear) {
		boolean leap = false;
		if (leapYear % 4 == 0 && leapYear % 100 == 0 && leapYear % 400 == 0) {
			leap = true;
		}
		if (leap) {
			System.out.println("Leap Year : " + leapYear);
		} else {
			System.out.println("Not a Leap Year : " + leapYear);
		}
		return leap;
	}
}

/*
 * 1. Divisible by 4 but not 100 and 400 2. Divisible by 100 3. Divisible by 400
 * 4. Divisible by all 5. Divisible by none
 */
