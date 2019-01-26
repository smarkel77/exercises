package com.techelevator;

public class Television {
	
	
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public void turnOff() {
		if (isOn) {
			isOn = false;
		}
	}
	
	public void turnOn() {
		if (!isOn) {
			isOn = true;
			this.currentChannel = 3;
			this.currentVolume = 2;
		}
	}
	public void changeChannel(int newChannel) {
		if (isOn && this.currentChannel >= 3 && this.currentChannel <= 18) {
			this.currentChannel = newChannel;
		}
	}
	public void channelUp() {
		if (isOn) {
			if (this.currentChannel < 18) {
				this.currentChannel++;
			} else this.currentChannel = 3;
		}
	}
	public void channelDown() {
		if (isOn) {
			if (this.currentChannel > 3) {
				this.currentChannel--;
			} else this.currentChannel = 18;
		}
	}
	public void raiseVolume() {
		if (isOn && this.currentVolume < 10) {
			this.currentVolume++;
		}
	}
	public void lowerVolume() {
		if (isOn && this.currentVolume > 0) {
			this.currentVolume--;
		}
	}
	
	
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	

}
