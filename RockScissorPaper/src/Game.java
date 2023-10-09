public class Game {
    Gamer gamer1;
    Gamer gamer2;
    static boolean isGameOver;

    Game(Gamer gamer1, Gamer gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    void start() {
        while (!isGameOver) {
            gamer1.move();
            gamer2.move();
            processMovement();
            displayScores(gamer1);
            displayScores(gamer2);
        }
    }

    void processMovement() {
        if (gamer1 == null || gamer2 == null || isGameOver) return;
        else if (gamer1.handsign == gamer2.handsign)
            Gamer.numberofDraws++;
        else if (gamer1.handsign == HandSign.PAPER && gamer2.handsign == HandSign.ROCK)
            gamer1.numberofWins++;
        else if (gamer1.handsign == HandSign.SCISSOR && gamer2.handsign == HandSign.PAPER)
            gamer1.numberofWins++;
        else if (gamer1.handsign == HandSign.ROCK && gamer2.handsign == HandSign.SCISSOR)
            gamer1.numberofWins++;
        else
            gamer2.numberofWins++;

        Gamer.numberofTrials++;
    }

    private void displayScores(Gamer gamer) {
        String gamerData = String.format(" gamer:%s number of wins: " +
                        "%d number of draws: %d number of trials: %d"
                , gamer.name, gamer.numberofWins, Gamer.numberofDraws, Gamer.numberofTrials);
        System.out.println(gamerData);
    }
}
