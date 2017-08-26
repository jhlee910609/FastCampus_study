
public class Duck extends Bird implements Flyable {
	
	String name;
	
	public Duck(String name){
		this.name = name;
	}
	
	public void introductMyself(){
		System.out.println("My name is " + this.name);
	}

	@Override
	public void eat(String food) {
		System.out.println("the duck is eating " + food);
	}

	@Override
	public void flying() {
		System.out.println("the bird is flying now");
	}

	@Override
	public void land() {
		System.out.println("the bird is landing now");
	}

	@Override
	public void takeOff() {
		System.out.println("the bird is taking off now");
	}
}
