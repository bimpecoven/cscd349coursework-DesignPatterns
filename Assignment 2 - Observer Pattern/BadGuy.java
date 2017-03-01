/*
 * Blake Impecoven - CSCD349 - Assignment 2: Observer
 * This is our Observer Class
**/ 

import java.util.*;

public class BadGuy extends Observer {

	protected EyeOfSauron eye;
	private String name;

	// EVC
	public BadGuy(EyeOfSauron eye, String name) {
		this.eye = eye;
		this.name = name;
		this.add();
	}//end BadGuy

	public void defeated() {
		eye.observers.remove(this);
	}//end defeated
	
	public void add() {
		this.eye.observers.add(this);
	}//end add

	public void update() {
		System.out.println("I am " + this.name + " and I know about " + this.eye);
	}//end notify

	
}//end Interface