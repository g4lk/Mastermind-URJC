package davidparla.urjc.mastermind.views;


import davidparla.urjc.mastermind.models.SecretCombination;
import davidparla.urjc.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
