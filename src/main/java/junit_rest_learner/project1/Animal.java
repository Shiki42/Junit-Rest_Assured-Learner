package junit_rest_learner.project1;

public class Animal {
	protected int name = 1;
	public void eat() {
		System.out.println("1");
	}
	public static void sleep() {
		System.out.println("2");
	}
	public Animal() {
		System.out.println("Animal main");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("3");
	}
	
	public void dog_only() {
		System.out.println("dog_only");
	}
	
	public Dog() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		System.out.println("dogs main");
	}
}

