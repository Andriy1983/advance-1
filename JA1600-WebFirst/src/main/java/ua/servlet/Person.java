package ua.servlet;

public class Person {
	int age;
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	

}
