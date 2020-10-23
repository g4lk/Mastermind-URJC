package davidparla.urjc.mastermind;

import davidparla.urjc.utils.Console;

import java.util.List;

public class Result {

    public static final int WIDTH = 4;
    private int blacks;
    private int whites;

    public Result(int blacks, int whites) {

        assert blacks >= 0;
        assert whites >= 0;

        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinner() {
        return this.blacks == Result.WIDTH;
    }

    public void writeln() {
        Message.RESULT.writeln(this.blacks, this.whites);
    }

}
