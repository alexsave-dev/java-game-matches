public class Computer {

    public Game game;

    public Computer(Game game) {
        this.game = game;
    }

    public void move() {
        ConsoleHelper.writeMessage("На столе осталось " + game.getMatchesCount() + " спичек.");
//        the computer will win if the remaining number of matches after the move fits the formula
//        remaining_number % 4 == 1
        int nextRemainingNumber = game.getMatchesCount();
        while (--nextRemainingNumber % 4 != 1);
        ConsoleHelper.writeMessage(" - Количество выбранных компьютером спичек = " + (game.getMatchesCount() - nextRemainingNumber));
        game.setMatchesCount(nextRemainingNumber);
    }
}
