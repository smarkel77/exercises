package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree (String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (numberOfPiecesToRemove > this.piecesOfFruitLeft) {
			return false;
		} else {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			if (piecesOfFruitLeft >= 0) {
				return true;
			}
		} 
		return false;
	}
	
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	
	
	

}
