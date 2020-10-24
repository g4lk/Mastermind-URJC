package davidparla.urjc.mastermind.views;


import davidparla.urjc.mastermind.models.Game;

public abstract class AbstractView {

    protected Game game;

    public AbstractView(Game game) {
        this.game = game;
    }

    public void interact() {
        do {
            this.start();
            boolean finished;
            do {
                finished = this.propose();
            } while (!finished);
        } while (this.isNewGame());
    }

    protected abstract void start();

    protected abstract boolean propose();

    protected abstract boolean isNewGame();

}
