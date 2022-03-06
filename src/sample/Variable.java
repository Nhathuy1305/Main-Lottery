package sample;

import java.util.Scanner;   // Importing Scanner library.   
import java.util.Random;    // Impoting Random library.

public class Variable {
    public int winTicket[] = new int[6];   // Declared winning ticket.
    public int ownTicket[] = new int[6];    // Created the user array ticket include 6 numbers.
    public int games = 0;   // Declared integer variable games to save the number of games the user want to play.
    public boolean pickTickets;    // This boolean variable is use to request the input is "true" or "false".
    public long money;      // Saving money the user received.
    public int gameWon = 0;     // Counting the number of games won.
    public int sameNum = 0;     // Counting the number of numbers match with the numbers on the tickets.
    public int matchSixNum = 0;     // Counting the tickets have 6 number match with the winning numbers.
    public long totalMoneyWon = 0;      // Sum of the money won each times.
    Scanner ip = new Scanner(System.in);    // Create object ip from Scanner library.
    Random ran = new Random();      // Create object ran from Random library.
}
