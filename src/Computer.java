public class Computer {

    public Game game;

    public Computer(Game game) {
        this.game = game;
    }

    public void move() {
        ConsoleHelper.writeMessage("На столе осталось " + game.getMatchesCount() + " спичек.\n");
        // the computer will win if the remaining number of matches after the move fits the formula
        // remaining_number % 4 == 1
        int nextRemainingNumber = game.getMatchesCount();
        while (--nextRemainingNumber % 4 != 1);
        ConsoleHelper.writeMessage(" - Количество выбранных компьютером спичек = " + (game.getMatchesCount() - nextRemainingNumber) + "\n");
        game.setMatchesCount(nextRemainingNumber);
    }

    public boolean canMove() {
        if (game.isOver()) {
            ConsoleHelper.writeMessage("Для компьютера осталась последняя спичка. Компьютер проиграл!");
            return false;
        }
        return true;
    }
}
