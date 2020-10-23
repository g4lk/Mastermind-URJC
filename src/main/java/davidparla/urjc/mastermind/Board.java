package davidparla.urjc.mastermind;


import davidparla.urjc.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int MAX_ATTEMPTS = 10;

    private final List<Result> results;
    private final SecretCombination secretCombination;
    private final List<ProposedCombination> proposedCombinations;
    private int attempts;

    public Board() {
        this.results = new ArrayList<>();
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.attempts = 0;
    }

    public void add(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
        this.attempts++;
    }

    public boolean isFinished() {
        return this.isLooser() || this.isWinner();
    }

    public boolean isWinner() {
        return this.results.get(attempts - 1).isWinner();
    }

    private boolean isLooser() {
        return this.attempts == Board.MAX_ATTEMPTS;
    }

    public void writeln() {
        Console.instance().writeln();

        Message.ATTEMPTS.writeln(this.attempts);
        this.secretCombination.writeln();
        for (int i = 0; i < this.attempts; i++) {
            this.proposedCombinations.get(i).write();
            this.results.get(i).writeln();
        }
    }
}
