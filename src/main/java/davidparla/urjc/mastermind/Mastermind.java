package davidparla.urjc.mastermind;


import davidparla.urjc.mastermind.models.Game;
import davidparla.urjc.mastermind.views.View;

public class Mastermind {

	private Game game;
	
	private View view;

	private Mastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}	

}
