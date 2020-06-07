public class Player {

    private Game game;

    public Player(Game game) {
        this.game = game;
    }

    public void move(){
        while (true){
            try {
                ConsoleHelper.writeMessage("На столе осталось " + game.getMatchesCount() + " спичек.\n");
                ConsoleHelper.writeMessage(" - Ход игрока. Введите количество спичек: " );
                int takenMatchesCount = Integer.parseInt(ConsoleHelper.readMessage());
                if (takenMatchesCount < 0 || takenMatchesCount > 3) {
                    ConsoleHelper.writeMessage("Некорректное количество спичек.\n");
                    continue;
                }
                game.setMatchesCount(game.getMatchesCount() - takenMatchesCount);
                break;
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Некорректное количество спичек.\n");
            }
        }
    }

    public boolean canMove() {
        if (game.isOver()) {
            ConsoleHelper.writeMessage("Для игрока осталась последняя спичка. Игрок проиграл!");
            return false;
        }
        return true;
    }

}

