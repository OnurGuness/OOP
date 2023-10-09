import java.util.Scanner;

enum HandSign {
    ROCK,
    SCISSOR,
    PAPER
}

public class Gamer {
    String name;
    int numberofWins;
    static int numberofDraws;
    static int numberofTrials;
    HandSign handsign;

    Gamer(String name) {
        this.name = name;
    }

    void move() {
        if (Game.isGameOver) return;
        boolean isInputValid = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter q for quit," + "r for fock, s for scissor, p for paper");

        do {
            System.out.println(this.name + "! your turn !");
            String choice = userInput.next();

            switch (choice) {
                case "q":
                    Game.isGameOver = true;
                    break;
                case "r":
                    this.handsign = HandSign.ROCK;
                    break;
                case "s":
                    this.handsign = HandSign.SCISSOR;
                    break;
                case "p":
                    this.handsign = HandSign.PAPER;
                    break;
                default:
                    isInputValid = true;
                    break;
            }
        }
        while (isInputValid);

    }

}
