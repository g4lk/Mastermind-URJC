package davidparla.urjc.mastermind;

import davidparla.urjc.utils.Console;

import java.util.ArrayList;

public class ProposedCombination extends Combination {

    public ProposedCombination() {
        super();
    }

    void read() {
        Error error;
        do {
            Message.PROPOSE_COMBINATION.write();
            error = this.checkError(Console.instance().readString());
            error.writeln();
            if (!error.isNull()) {
                this.colors = new ArrayList<>();
            }
        } while (!error.isNull());
    }

    private Error checkError(String colorCharacters) {

        if (colorCharacters.length() != Result.WIDTH) {
            return Error.WRONG_LENGTH;
        }

        for (int i = 0; i < colorCharacters.length(); i++) {
            Color color = Color.get(colorCharacters.charAt(i));

            if (color.isNull()) {
                return Error.WRONG_COLORS;
            }

            for (int j = 0; j < i; j++) {
                if (this.colors.get(j) == color) {
                    return Error.DUPLICATE_COLORS;
                }
            }

            this.colors.add(color);
        }
        return Error.NULL_ERROR;
    }

    public boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    public boolean contains(Color color) {
        for (Color value : this.colors) {
            if (value == color) {
                return true;
            }
        }
        return false;
    }

    void write() {
        for (Color color : this.colors) {
            color.write();
        }
    }

}
