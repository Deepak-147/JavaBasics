package inheritance;

public class Student extends Person {
	
	private String collegeName;
	private int year;
	
	public Student(String name, String collegeName) {
		// Explicitly calling Parent(Person) class constructor. Otherwise default super() constructor is called.
		super(name);
		
		System.out.println("Student constructor");
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", year=" + year + ", studentName=" + super.getName() + ", studentEmail=" + super.getEmail() + ", studentPhoneNumber=" + super.getPhoneNumber() + "]";
	}

}
