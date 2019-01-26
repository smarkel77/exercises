package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

	public Elevator(int totalNumberOffloors) {
		this.currentFloor = 1;
		this.numberOfFloors = totalNumberOffloors;
		
	}

	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
	}

	public void goUp(int desiredFloor) {
		if (!doorOpen) {
			if (this.getCurrentFloor() < desiredFloor && desiredFloor > 1 && desiredFloor <= numberOfFloors) {
				this.currentFloor = desiredFloor;
			}
		}
	}

	public void goDown(int desiredFloor) {
		if (!doorOpen) {
			if (this.getCurrentFloor() > desiredFloor && desiredFloor >= 1 && desiredFloor < numberOfFloors) {
				this.currentFloor = desiredFloor;
			}
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

}
