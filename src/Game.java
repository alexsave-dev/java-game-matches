public class Game {

    private final static int MAX_MATCHES_COUNT = 20;
    private int matchesCount = MAX_MATCHES_COUNT;
    private Computer computer;
    private Player player;

    public boolean isOver() {
        return matchesCount == 1;
    }

    public int getMatchesCount() {
        return matchesCount;
    }

    public void setMatchesCount(int matchesCount) {
        this.matchesCount = matchesCount;
    }

    public Game() {
        computer = new Computer(this);
        player = new Player(this);
    }

    public static void main(String[] args) {

        Game game = new Game();
        while(true) {
            if (game.computer.canMove()) {
                game.computer.move();
            } else {
                break;
            }
            if (game.player.canMove()) {
                game.player.move();
            } else {
                break;
            }
        }
    }
}
