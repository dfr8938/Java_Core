public class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String send(String str) {
		return str;
	}

	public void display() {
		System.out.println("name: " + this.getName());
		System.out.println("age: " + this.getAge());
	}
}