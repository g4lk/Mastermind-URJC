package davidparla.urjc.mastermind;

import davidparla.urjc.utils.Console;

enum Message {

    TITLE("---- MASTERMIND ----"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ATTEMPTS(":attempts attempt(s):"),
    RESULT("--> :blacks blacks and :whites whites"),
    WINNER("You win!!! :-)"),
    LOOSER("You lose!!! :-("),
    RESUME("Do you want to continue");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    void write() {
        Console.instance().write(this.message);
    }

    void writeln() { Console.instance().writeln(this.message); }

    void writeln(int attempts) {
        assert this == Message.ATTEMPTS;

        String message = ATTEMPTS.message.replace(":attempts", String.valueOf(attempts));
        Console.instance().writeln(message);
    }

    void writeln(int blacks, int whites) {
        assert this == Message.RESULT;

        String message = RESULT.message
                .replaceFirst(":blacks", String.valueOf(blacks))
                .replaceFirst(":whites", String.valueOf(whites));

        Console.instance().writeln(message);
    }

}