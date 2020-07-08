public class Fish extends Animal {

	public Fish(String name, int age){
		super(name, age);
	}

	public void display() {
		System.out.println("fish name: " + this.getName());
		System.out.println("fish age: " + this.getAge());
	}
}