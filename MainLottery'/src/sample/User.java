package sample;

public class User{
    
    Variable var = new Variable();

     // Request the user enter the number of game they want to play.
    public void getNumberOfGames() {
        System.out.println("How many games do you want to play?");
        var.games = var.ip.nextInt();       // Insert an integer value for games.
    }

    // Choose true if the user want to input their own tickets / false if they want to have random ticket numbers.
    public void chooseTickets() {
        System.out.println("\n\nDo you want to pick your own tickets number (true/false)?");
        var.pickTickets = var.ip.nextBoolean();     // Insert boolean value (true/false) for pickTickets.
    }

    // Enter 6 numbers from keyboard if the user want to input their own tickets.
    public void inputTickets() {
        System.out.println("Enter 6 numbers of your ticket (1-49):");

        for (int i = 0; i < var.ownTicket.length; i++) {
            var.ownTicket[i]  = var.ip.nextInt();  
        } 
    }
}
