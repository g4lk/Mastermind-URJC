package davidparla.urjc.mastermind.views;


import davidparla.urjc.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
