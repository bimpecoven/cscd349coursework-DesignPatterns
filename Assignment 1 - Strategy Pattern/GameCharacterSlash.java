/*
 * Blake Impecoven
 * CSCD349 - Strategy Pattern
 * Guitar Hero assignment - Game Character Class
**/

public class GameCharacterSlash implements IGameCharacter {

	private String charName;
	private IGuitar guitar;
	private ISolo solo;

	public GameCharacterSlash() {
		this.charName = "Slash";
		this.guitar = new GibsonSG();
		this.solo = new GuitarFire();
	}//end Slash Constructor

	public void playGuitar() {
      System.out.print("Current Player: " + charName + ". ");
		this.guitar.playGuitar();
	}//end playGuitar

	public void playSolo() {
      System.out.print("Current Player: " + charName + ". ");
		this.solo.playSolo();
	}//end playSolo

	/*
	 * Set Methods
	**/ 
	public void setGuitar(final IGuitar guitar) {
		this.guitar = guitar;
	}//end setGuitar

	public void setSolo(final ISolo solo) {
		this.solo = solo;
	}//end setSolo

}//end class