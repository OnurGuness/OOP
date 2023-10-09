public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("Seyit");
        Gamer gamer2 = new Gamer("Onur");
        Game game = new Game(gamer1, gamer2);
        game.start();
    }
}