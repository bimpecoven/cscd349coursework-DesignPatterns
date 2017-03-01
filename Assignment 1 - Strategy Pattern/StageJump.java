/*
 * Blake Impecoven
 * CSCD349 - Strategy Pattern
 * Guitar Hero assignment - Solo Class(Stage Jump)
**/

public class StageJump implements ISolo {

	public StageJump() {

	}//end constructor

	@Override
	public void playSolo() {
		System.out.println("You jump off of the stage during your solo.");
	}//end playSolo

}//end class StageJump