package Encapsulation;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Main {
	public static void main(String[] args) {
		Person obj = new Person();
		obj.setName("Pavithra");
		System.out.println("Name : " +obj.getName());
	}
}
