package weekend_practise;

public class Bird extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I can eat only veg and sometimes non veg");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("i have to sleep only at night");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("I can sound only one way");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(" i can walk anytime");
	}
	public void fly() {
		System.out.println(" i can fly tooo");
	}

}
