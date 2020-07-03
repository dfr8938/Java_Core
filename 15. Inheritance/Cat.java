public class Cat extends Animal {

	public Cat(String name, int age){
		super(name, age);
	}

	public void display() {
		System.out.println("cat name: " + this.getName());
		System.out.println("cat age: " + this.getAge());
	}
}