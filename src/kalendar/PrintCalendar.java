package kalendar;

public class PrintCalendar {

	private int month, year;

	public PrintCalendar() {
	}

	// creating constructor with arguments
	public PrintCalendar(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}

	// prints month,year and table look
	public void printWholeCalendar() {
		System.out.println("###########################################");
		printHead();
		printBody();
		System.out.println("\n###########################################");
	}

	// printing top of the table
	public void printHead() {
		System.out.println("\t\t" + getMonth() + " " + year);
		System.out.print(
				"___________________________________________\n" + "   Sun   Mon   Tue   Wed   Thu    Fri   Sat\n");
	}

	// printing calendar body
	public void printBody() {
		// getting days for this month
		int daysInMonth = getDaysInMonth(month, year);
		// getting start day
		int startDay = getStartDay();
		// blank spaces until start day
		for (int i = 1; i < startDay; i++) {
			System.out.print("      ");
		}
		// will print numbers till daysInMonth with 6 spaces for numbers
		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf("%6d", i);
			// go to new row when
			if ((i + startDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}

	public int getDaysInMonth(int month, int year) {
		int numberOfDays = 0;
		// numbers are months with 31 day
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			numberOfDays = 31;
			// months with 30 days
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			numberOfDays = 30;
			// this is February
		} else {
			// if year is Leap 29 days, if not 28 days
			if (isLeap(year)) {
				numberOfDays = 29;
			} else
				numberOfDays = 28;
		}
		return numberOfDays;
	}

	public int getStartDay() {
		int totalDays = 0;
		// number of days until this year
		for (int i = 1800; i < year; i++) {
			if (isLeap(i)) {
				totalDays += 366;
			} else
				totalDays += 365;
		}
		// number of days in this year until entered month
		for (int i = 1; i < month; i++) {
			totalDays += getDaysInMonth(i, year);

		}
		// we are returning total days +3 for Wednesday +1 because it start from
		// Sun. 7 is number of days
		return (totalDays + 4) % 7;
	}

	// checking if year is Leap
	public boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		return false;
	}

	public String getMonth() {

		boolean wrong = true;
		// while input is wrong it will loop
		while (wrong) {
			switch (month) {
			case 1:
				// when input is correct it will stop the loop
				wrong = false;
				return "January";

			case 2:
				wrong = false;
				return "February";
			case 3:
				wrong = false;
				return "March";
			case 4:
				wrong = false;
				return "April";
			case 5:
				wrong = false;
				return "May";
			case 6:
				wrong = false;
				return "June";
			case 7:
				wrong = false;
				return "July";
			case 8:
				wrong = false;
				return "August";
			case 9:
				wrong = false;
				return "September";
			case 10:
				wrong = false;
				return "October";
			case 11:
				wrong = false;
				return "November";
			case 12:
				wrong = false;
				return "December";

			}
		}
		return "Wrong Input!";
	}
}
