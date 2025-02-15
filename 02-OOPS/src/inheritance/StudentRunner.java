package inheritance;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		Student student = new Student("Deepak", "GIT, Jaipur");
		student.setPhoneNumber("8098444542");
		student.setEmail("deepaklaxkar11@gmail.com");
		student.setYear(2011);
		System.out.println(student);

		Employee employee = new Employee("Deepak", "Programmer Analyst");
		employee.setPhoneNumber("8098444542");
		employee.setEmail("deepaklaxkar11@gmail.com");
		employee.setEmployerName("NetApp");
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal("1200000"));
		System.out.println(employee);
	}
}