package sample;

public class Prize {
    Variable var = new Variable();
    
    // From the same numbers, we will know the prizes that the user received, corresponding with each case:
    public long prize() {
        switch (var.sameNum) {
            case 1:             // Match 1 or 2: $10.
            case 2:
                var.money = 10;
                break;
            case 3:             // Match 3: $100.
                var.money = 100;
                break;
            case 4:             // Match 4: $1000.
                var.money = 1000;
                break;
            case 5:             // Match 5: $5000.
                var.money = 5000;
                break;
            case 6:             // Match all 6 numbers: $5 million in cash.
                var.money = 5000000;
                break;
            default:            // If not match any numbers, receive $0.
                var.money = 0;
                break;
        }
        return var.money;
    }

    // Calculate the sum of the total money of the user through each game.
    public void totalTicket() {
        var.totalMoneyWon += var.money;
    }
}
