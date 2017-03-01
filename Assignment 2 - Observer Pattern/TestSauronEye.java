/*
 * Blake Impecoven - CSCD349 - Assignment 2: Observer
 * Base of tester class proided by Tom.
**/ 

import java.util.*;

public class TestSauronEye {

    public static void main(String[]args) {

        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing= new BadGuy(eye, "Witch King");
        eye.setEnemies(1, 1, 2, 0); //hobbits, elves, dwarves, men -- BTW, this is HORRIBLE coding style and a bad code smell
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves
        
        System.out.println(">Saruman Defeated.");
        saruman.defeated(); //Saruman is no longer registered with the Eye
        eye.setEnemies(4, 2, 2, 100);
        //only the Witch King reports on the enemies
        
        System.out.println(">Add Tom.");
        BadGuy tom = new BadGuy(eye, "Tom Capaul");
        eye.setEnemies(7, 12, 400, 1);

    }//end main

}//end Tester Class