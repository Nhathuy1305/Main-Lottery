package sample;

public class Check {
    Variable var = new Variable();
    User user = new User();

    // Using to check the tickets if its numbers out of the range from 1 to 49.
    public void checkValidTicket() {
        for (int i = 0; i < var.ownTicket.length; i++) {
                if (var.ownTicket[i] < 1 || var.ownTicket[i] > 49) {
                    System.out.println("The ticket numbers is out of the range from 1 to 49. Enter again!");
                    user.inputTickets();         
                }
        }
    }

    // Calculate the numbers on the ticket matches with the winning number and return its sum.
    public int sameNumber() {
        for (int i = 0; i < 6; i++) {
            if (var.ownTicket[i] == var.winTicket[i])
                var.sameNum++;
        }
        return var.sameNum;
    }
}
