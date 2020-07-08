public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat("Barsik", 12);
		cat.display();
		// System.out.println(" cat name: " + cat.getName());
		// System.out.println("  cat age: " + cat.getAge());
		System.out.println("cat send: " + cat.send("Miay!"));

		Dog dog = new Dog("Bobik", 2);
		dog.display();
		// System.out.println(" dog name: " + dog.getName());
		// System.out.println("  dog age: " + dog.getAge());
		System.out.println("dog send: " + cat.send("Guff!"));

		Fish fish = new Fish("Nemo", 1);
		fish.display();
		// System.out.println("fish name: " + fish.getName());
		// System.out.println(" fish age: " + fish.getAge());
		System.out.println("fish send: " + cat.send("does not say anything..."));

	}
}