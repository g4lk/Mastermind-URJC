package davidparla.urjc.mastermind;

import davidparla.urjc.utils.Console;

import java.util.Collections;
import java.util.Arrays;
import java.util.Random;


public class SecretCombination extends Combination {

    public SecretCombination() {
        super();
        for (int i = 0; i < Color.values().length - 1 ; i++) {
            this.colors.add(Color.get(i));
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < Color.values().length - 1 - Result.WIDTH; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
    }

    public Result getResult(ProposedCombination proposedCombination) {
        int blacks = 0;
        for (int i = 0; i < this.colors.size() ; i++) {
            if (proposedCombination.contains(this.colors.get(i), i)) {
                blacks++;
            }
        }
        int whites = 0;
        for (Color color : this.colors) {
            if (proposedCombination.contains(color)) {
                whites++;
            }
        }
        return new Result(blacks, whites - blacks);
    }

    void writeln() {
        Console.instance().write("**** - ");
        for (Color color : this.colors) {
            color.write();
        }
        Console.instance().writeln();
    }

}
