public class Game {

    private final int MAX_MATCHES_COUNT = 20;
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
            if (game.isOver()) {
                ConsoleHelper.writeMessage("Для компьютера осталась последняя спичка. Компьютер проиграл!");
                break;
            } else {
                game.computer.move();
            }
            if (game.isOver()) {
                ConsoleHelper.writeMessage("Для игрока осталась последняя спичка. Игрок проиграл!");
                break;
            } else {
                game.player.move();
            }
        }
    }
}
