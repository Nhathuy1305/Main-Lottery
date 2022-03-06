package sample;

public class Product {
    Variable var = new Variable();
    Random ran = new Random();
    Check check = new Check();
    Prize prize = new Prize();
    User user = new User();
    Counting count = new Counting();

    // Show each index of ownTicket on the screen.
    public void outputTickets() {
        System.out.print("You have picked the ticket: ");
        for (int i = 0; i < var.ownTicket.length; i++) {
            System.out.print(var.ownTicket[i] + " ");
        }
    }

    // Show each index of winTicket on the screen.
    public void winningTicket() {
        ran.randomWinningNumbers();
        System.out.print("\nThe winning ticket is: ");
        for (int i = 0; i < var.winTicket.length; i++) {
            System.out.print(var.winTicket[i] + " ");
        }
    }

    // Show the value of the same numbers.
    public void outputTicketMatch() {
        int temp = check.sameNumber();
        System.out.print("\nYour ticket has matched " + temp + " number(s)");
    }

    // Output the prize that the user received.
    public void outputPrize() {
        long amountOfMoney = prize.prize();
        System.out.print("\nYou have won $" + amountOfMoney);
    }

     // This function runs the loop of the program, and operate the declared function.
     public void loopGame() {
        int i = 0;
        while (i < var.games) {            
            user.chooseTickets();
            ran.randomTickets();
            winningTicket();
            outputTicketMatch();
            outputPrize();
            count.numberGameWon();
            count.numberOfGameMatchSixNumber();
            prize.totalTicket();
            i++;
        }
    }

     // Output the number of games won.
     public void outputGameWon() {
        System.out.println("\n\nThe number of games won any money: " + var.gameWon);
    }
    
    // Output the number of games match all 6 numbers.
    public void output_numberOfGameMatchSixNumber() {
        System.out.println("The number of games matched all 6 numbers: " + var.matchSixNum);
    }
    
    // Output the total money after the end of the game.
    public void outputTotalMoney() {
        System.out.println("Total money won: $" + var.totalMoneyWon);
    }

    // Output the total money that the user has to pay for each game.
    public void outputTotalTicketCost() {
        System.out.println("Total ticket cost: $" + var.games * 4);
    }

    // Output the profit or loss between the money of each ticket that the user buys and the money they get.
    public void outputProfitLoss() {
        System.out.println("Profit/Loss (won/cost): $" + (int) (var.totalMoneyWon - var.games * 4));
    }
}
