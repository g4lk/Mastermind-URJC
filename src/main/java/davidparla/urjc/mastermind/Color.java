package davidparla.urjc.mastermind;

import davidparla.urjc.utils.Console;

public enum Color {

    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PURPLE('p'),
    NULL_COLOR;

    private char symbol;

    Color() {}

    Color(char symbol) {
        this.symbol = symbol;
    }

    static Color get(int ordinal) {
        return Color.values()[ordinal];
    }

    static Color get(char color) {

        for (Color c : Color.values()) {
            if (c.symbol == color) {
                return c;
            }
        }
        return Color.NULL_COLOR;
    }

    void write() {
        assert this != Color.NULL_COLOR;
        new Console().write(this.symbol);
    }

    boolean isNull() { return this == NULL_COLOR; }
}
