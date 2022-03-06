package sample;

public class App {
    public static void main(String[] args) {
        User user = new User();
        Product prod = new Product();
        user.getNumberOfGames();
        prod.loopGame();
        prod.outputGameWon();
        prod.output_numberOfGameMatchSixNumber();
        prod.outputTotalMoney();
        prod.outputTotalTicketCost();
        prod.outputProfitLoss();
    }
}
