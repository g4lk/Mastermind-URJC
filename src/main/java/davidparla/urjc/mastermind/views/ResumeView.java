package davidparla.urjc.mastermind.views;


import davidparla.urjc.mastermind.models.Game;
import davidparla.urjc.utils.YesNoDialog;

class ResumeView {

	private Game game;

	ResumeView(Game game) {
		this.game = game;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
