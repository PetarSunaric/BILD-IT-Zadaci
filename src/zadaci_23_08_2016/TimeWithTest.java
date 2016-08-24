package zadaci_23_08_2016;

import java.util.GregorianCalendar;

/*
	Time
	----
-hour: int
-minute: int
-second: int
-------------
+Time()
+Time(elapsedTime: long)
+Time(hour: int, minute: int, second: int)
+getHour: int
+getMinute: int
+getSecond: int
+setTime(elapseTime: long): void
*/
public class TimeWithTest {

	public static void main(String[] args) {

		// creating instance of Time class with no-arg constructor
		Time time = new Time();
		System.out.println("Curent time is: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
		// creating instance of Time class with elapsed time in milliseconds
		Time time1 = new Time(555550000);
		System.out.println(
				"555550000 milliseconds after: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
	}

}

class Time {

	// using class GregorianCalendar to obtain hours, miutes, and seconds
	GregorianCalendar gc = new GregorianCalendar();

	private int hour = gc.get(GregorianCalendar.HOUR_OF_DAY);
	private int minute = gc.get(GregorianCalendar.MINUTE);
	private int second = gc.get(GregorianCalendar.SECOND);

	// no-arg costructor
	Time() {
	}

	// constructor with elapsed time in milliseconds
	Time(long elapsedTime) {
		int seconds = (int) elapsedTime / 1000;
		this.hour = seconds / 3600 % 24;
		this.minute = seconds % 3600 / 60 % 60;
		this.second = seconds % 3600 % 60 % 60;
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// getters
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// elapsed time in milliseconds
	void setTime(long elapsedTime) {
		int seconds = (int) elapsedTime / 1000;
		this.hour = seconds / 3600 % 24;
		this.minute = seconds % 3600 / 60 % 60;
		this.second = seconds % 3600 % 60 % 60;
	}

}