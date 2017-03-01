/*
 * Blake Impecoven
 * CSCD349 - Strategy Pattern
 * Guitar Hero assignment - Main Program
**/

import java.util.*;

public class GuitarHero {
	public static void main(String[]Args) {
   
        System.out.println("Default test. All 3 players should be different.\nAll 3 players using Gibson SG and Guitar Fire solo.\n");

		  IGameCharacter player1 = new GameCharacterSlash(); //note that constructor could be designed to accept initial behaviors
        IGameCharacter player2 = new GameCharacterHendrix();
        IGameCharacter player3 = new GameCharacterYoung();

        //play default guitar - should be Gibson SG
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        
        System.out.println();

        //play default solo - should be Guitar Fire
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();
        
        System.out.println("\nNow lets change their guitars.\n");

        //add code below to show the swapping of behaviors
        //Lets test out changing guitar's.
        player1.setGuitar(new FenderTelecaster());
        player2.setGuitar(new GibsonFlyingV());
        player3.setGuitar(new FenderTelecaster());

        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        
        System.out.println("\nNow lets change their solos.\n");

        //Lets test out changing solo's.
        player1.setSolo(new StageJump());
        player2.setSolo(new SmashGuitar());
        player3.setSolo(new SmashGuitar());

        player1.playSolo();
        player2.playSolo();
        player3.playSolo();
	}//end main
}//end class