package com.techelevator.dog;

public class Dog {

	private boolean sleeping;
	
	
	public String makeSound() {
		if (this.isSleeping() ) {
			return "Zzzzz...";
		}
		return "Woof!";
	}
	
	
	
	
	public void sleep() {
		sleeping = true;
	}
	
	
	
	
	public void wakeUp() {
		sleeping = false;
	}

	public boolean isSleeping() {
		return sleeping;
	}
	
	public Dog() {
		sleeping = false;
	}
	
	
	
}
