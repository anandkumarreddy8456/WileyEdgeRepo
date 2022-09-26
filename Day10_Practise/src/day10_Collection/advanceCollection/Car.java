package day10_Collection.advanceCollection;

public class Car {
	String module;

	public Car(String module) {
		super();
		this.module = module;
	}
	
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return module;
	}
	

}
