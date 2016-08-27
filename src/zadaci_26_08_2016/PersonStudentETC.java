package zadaci_26_08_2016;

import java.util.Date;

public class PersonStudentETC {

	public static void main(String[] args) {

		// creating a instance of Person
		Person person = new Person();
		person.setName("Jon Snow");
		person.setAddress("Castle Black, 82");
		person.setEmail("castle.black@hotmail.com");
		person.setPhone(061666666);
		System.out.println(person);

		// creating a instance of Staff
		Staff staff = new Staff();
		System.out.println();
		staff.setName("Ned Stark");
		staff.setTitle("King of North");
		System.out.println(staff);

		// creating a instance of Faculty
		Faculty faculty = new Faculty();
		System.out.println();
		faculty.setName("Zdravko");
		faculty.setOfficeHours(40);
		faculty.setRank("Profesor");
		System.out.println(faculty);

		// creating a instance og Employee
		Employee employee = new Employee();
		System.out.println();
		employee.setName("Nedim");
		employee.setOffice("Post Office");
		employee.setSalary(2000);
		System.out.println(employee);

		// creating a instance of Student
		Student student = new Student();
		System.out.println();
		student.setName("Ljubisa");
		student.setStatus(2);
		System.out.println(student);
	}
}

class Person {
	/*
	 * -name: String 
	 * -address: String 
	 * -phone: long 
	 * -email: String
	 * --------------- 
	 * +Person() 
	 * +Person(name: String, address: string, phone: long, email: String) 
	 * +toString(): String
	 */
	private String name;
	private String address;	// data fields
	private long phone;
	private String email;

	// no-arg constructor
	Person() {
	}

	Person(String name, String address, long phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person name is: " + getName() + ",address is: " + getAddress() + ",phone is: " + getPhone() + ",email is: "
				+ getEmail();
	}
}

class Student extends Person {

	/*
	 * -status: String 
	 * ---------------- 
	 * +Student() 
	 * +setStatus(): void
	 * +getStatus(): String 
	 * +toString(): String
	 */

	//data fields
	private final String FRESHMAN = "Freshman";
	private final String SOPHOMORE = "Sophomore";
	private final String JUNIOR = "Junior";
	private final String SENIOR = "Senior";
	private String status;

	Student() {	//no-arg constructor
	}

	public void setStatus(int status) {	//setting status depends on number
		switch (status) {
		case 1:
			this.status = FRESHMAN;
			break;
		case 2:
			this.status = SOPHOMORE;
			break;
		case 3:
			this.status = JUNIOR;
			break;
		case 4:
			this.status = SENIOR;
			break;
		}
	}

	public String getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		return "\nStudent status is " + getStatus() + " student";
	}
}

class Employee extends Person {
	/*
	 * -office: String 
	 * -salary: double 
	 * -dateHired: Date 
	 * -----------------
	 * +Employee() 
	 * +toString(): String
	 */

	private String office;
	private double salary;		//data fields
	private Date dateHired = new Date();

	Employee() {	//no-arg constructor
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "\nEmployee is hired: " + getDateHired() + ", works at office: " + getOffice()
				+ " and his salary is: " + getSalary();
	}
}

class Faculty extends Employee {

	/*
	 * -officeHours: int 
	 * -rank: String 
	 * -------------------- 
	 * +Faculty()
	 * +toString(): String
	 */
	private int officeHours;			//data fields
	private String rank;

	Faculty() {	//no-arg constructor
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "\nFaculty office hours are: " + getOfficeHours() + " at rank: " + getRank();
	}
}

class Staff extends Employee {
	/*
	 * -title: String 
	 * --------------- 
	 * +Staff() 
	 * +toString: String
	 */

	private String title;	//data field

	Staff() {	//no-arg constructor
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "\nStaff has title: " + getTitle();
	}
}