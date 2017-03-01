/*
 * Blake Impecoven - CSCD349 - Assignment 2: Observer
 * This is our Subject class
**/ 

import java.util.*;

public class EyeOfSauron extends Observable {

	protected List<Observer> observers;
	protected int hobbitCount, elfCount, dwarfCount, menCount;

	public EyeOfSauron() {
		this.observers = new ArrayList<Observer>();
		this.hobbitCount = 0;
		this.elfCount = 0;
		this.dwarfCount = 0;
		this.menCount = 0;
	}//end EyeOfSauron

	public void setEnemies(int hobbitCount, int elfCount, int dwarfCount, int menCount) {
		this.hobbitCount = hobbitCount;
		this.elfCount = elfCount;
		this.dwarfCount = dwarfCount;
		this.menCount = menCount;

		notifyAllObservers();
	}//end setEnemies

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}//end for
	}//end notifyAllObservers
	
	public String toString() {
		
		String str = "";
		str += this.hobbitCount + " Hobbits, ";
		str += this.elfCount + " Elves, ";
		str += this.dwarfCount + " Dwarves and ";
		str += this.menCount + " Men";

		return str;
	}//end toString
	
}//end class