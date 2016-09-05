package zadaci_03_09_2016;

public class CourseClassClonable {

	public static void main(String[] args) {

		// course object
		Course c = new Course("Some");
		// adding student to course
		c.addStudent("First");
		// adding second student to course
		c.addStudent("Second");
		// creating new course object
		Course c2 = new Course();
		// assigning value to second clone object
		c2 = (Course) c.clone();
		// printing out student at index 1 for "cloned" object
		System.out.println(c2.getStudents()[1]);

	}

}

// Course class that implements cloneable interface

class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// default constructor
	public Course() {

	}

	// constructor that sets name for the course
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// method that adds student to the array
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// get method for students data field
	public String[] getStudents() {
		return students;
	}

	// method that returns number of students
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// method that returns course name
	public String getCourseName() {
		return courseName;
	}

	// overriden clone method
	public Object clone() {
		// creates new course object
		Course clone = new Course(this.courseName);
		// copying the list of students from old object to new
		for (int i = 0; i < this.students.length; i++) {
			clone.students[i] = this.students[i];
		}
		return clone;

	}

}
