public class Computer {

    public Game game;

    public Computer(Game game) {
        this.game = game;
    }

    public void move() {
        ConsoleHelper.writeMessage("На столе осталось " + game.getMatchesCount() + " спичек.\n");
        int takenMatchesCount = (int) (Math.random() * 3) + 1;
        ConsoleHelper.writeMessage(" - Количество выбранных компьютером спичек = " + takenMatchesCount + "\n");
        game.setMatchesCount(game.getMatchesCount() - takenMatchesCount);
    }

    public boolean canMove() {
        if (game.isOver()) {
            ConsoleHelper.writeMessage("Для компьютера осталась последняя спичка. Компьютер проиграл!");
            return false;
        }
        return true;
    }
}
