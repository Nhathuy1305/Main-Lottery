package sample;

public class Random {
    Variable var = new Variable();
    Product product = new Product();
    Check check = new Check();
    User user = new User();

    // Create a random function to generate numbers.
    public void randomNumbers() {
        int cur = 0;
        int remaining = 49;
        int count = var.ownTicket.length;
        for (int i = 1; i < 50; i++) {
            double probability = var.ran.nextDouble();
            if (probability < ((double) count) / (double) remaining) {
                count--;
                var.ownTicket[cur++] = i;
            }
            remaining--;
        }     
    }

    // Create a random function to generate winning numbers.
    public void randomWinningNumbers() {
        int cur = 0;
        int remaining = 49;
        int count = var.winTicket.length;
        for (int i = 1; i < 50; i++) {
            double probability = var.ran.nextDouble();
            if (probability < ((double) count) / (double) remaining) {
                count--;
                var.winTicket[cur++] = i;
            }
            remaining--;
        }     
    }

    // This function to perform if the user want to input their own tickets or not.
    public void randomTickets() {
        if (var.pickTickets == false) {
            randomNumbers();
            product.outputTickets();
        } else if (var.pickTickets == true) {
            user.inputTickets();
            check.checkValidTicket();
            product.outputTickets();
        }
    }
}
