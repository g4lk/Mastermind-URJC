package davidparla.urjc.mastermind.views;


import davidparla.urjc.mastermind.models.Error;
import davidparla.urjc.utils.WithConsoleView;

class ErrorView extends WithConsoleView {

	private static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	private final Error error;

	ErrorView(Error error) {
		this.error = error;
	}



	public 	void writeln() {
		this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
