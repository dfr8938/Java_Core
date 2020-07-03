public class Dog extends Animal {

	public Dog(String name, int age){
		super(name, age);
	}

	public void display() {
		System.out.println("dog name: " + this.getName());
		System.out.println("dog age: " + this.getAge());
	}
}