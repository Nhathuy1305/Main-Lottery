package sample;



public class Counting {
    Variable var = new Variable();

    // Counting the number of game won.
    public void numberGameWon() {
        if (var.sameNum > 0)
            var.gameWon++;
    }

    // Counting the number of games matches 6 numbers.
    public void numberOfGameMatchSixNumber() {
        if (var.sameNum == 6)
            var.matchSixNum++;
    }
}
