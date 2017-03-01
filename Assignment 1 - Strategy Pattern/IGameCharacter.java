/*
 * Blake Impecoven
 * CSCD349 - Strategy Pattern
 * Guitar Hero assignment - Game Character Class
**/

public interface IGameCharacter {

	public void playGuitar();
	public void playSolo();

	public void setGuitar(final IGuitar guitar);
	public void setSolo(final ISolo solo);

}//end Class GameCharacter