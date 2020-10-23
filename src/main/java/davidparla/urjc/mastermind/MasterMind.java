package davidparla.urjc.mastermind;

import davidparla.urjc.utils.YesNoDialog;

public class MasterMind {

    private Board board;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        Message.TITLE.writeln();
        this.board = new Board();
        this.board.writeln();
        do {
            ProposedCombination proposedCombination = new ProposedCombination();
            proposedCombination.read();
            this.board.add(proposedCombination);
            this.board.writeln();
        } while (!this.board.isFinished());

        Message message = this.board.isWinner() ? Message.WINNER : Message.LOOSER;
        message.writeln();
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
