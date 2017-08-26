package com.junhee.java.observer;

public class ExamAbstract {

	public static void main(String args[]) {

		Tiger tiger = new Tiger("티거");
		Animal dog = new Dog("코기");

		System.out.println("=========" + tiger.animalName.toString());
		tiger.growl();
		tiger.breathe();
		tiger.eat();

		System.out.println("=========" + dog.animalName.toString());
		dog.growl();
		dog.breathe();
		dog.eat();
	}
}

abstract class Animal {
	String animalName;

	Animal(String name) {
		this.animalName = name;
	}

	public abstract void growl();

	public abstract void eat();

	public abstract void breathe();

}

class Tiger extends Animal {

	Tiger(String name) {
		super(name);
	}

	@Override
	public void growl() {
		System.out.println("으르렁, 으르렁, 으르렁 대!");
	}

	@Override
	public void eat() {
		System.out.println("호랑이가 밥을 먹는다.");
	}

	@Override
	public void breathe() {
		System.out.println("호랑이가 숨을 쉰다.");
	}
}

class Dog extends Animal {

	Dog(String name) {
		super(name);
	}

	@Override
	public void growl() {
		System.out.println("멍멍");

	}

	@Override
	public void eat() {
		System.out.println("강아지가 밥을 먹는다.");

	}

	@Override
	public void breathe() {

		System.out.println("강아지가 숨을 쉰다.");

	}

}
