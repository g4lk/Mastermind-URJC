package davidparla.urjc.mastermind.views;


import davidparla.urjc.mastermind.models.Result;
import davidparla.urjc.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private final Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
