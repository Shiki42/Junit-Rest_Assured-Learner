package junit_rest_learner.project1;

public class Test{
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.dog_only();
		System.out.println(dog instanceof Animal);
		System.out.println(dog instanceof Dog);
		Test2 a = new Test2();
	}
}

class Test2{
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog instanceof Animal);
		System.out.println(dog instanceof Dog);
	}
}

