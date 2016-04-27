package connect2;

public class Person {
	int idClient;
	String firstName;
	String lastName;
	String education;
	String passport;
	String city;
	String age;
	int department_idDepartment;

	public Person(int idClient, String firstName, String lastName, String education, String passport, String city,
			String age, int department_idDepartment) {
		super();
		this.idClient = idClient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.education = education;
		this.passport = passport;
		this.city = city;
		this.age = age;
		this.department_idDepartment = department_idDepartment;
	}

	@Override
	public String toString() {
		return "Person [idClient=" + idClient + ", firstName=" + firstName + ", lastName=" + lastName + ", education="
				+ education + ", passport=" + passport + ", city=" + city + ", age=" + age
				+ ", department_idDepartment=" + department_idDepartment + "]";
	}
	
	

}
