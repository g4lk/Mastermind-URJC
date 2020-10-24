package davidparla.urjc.mastermind.models;

public enum Color {
	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE;

	public static int length() {
		return Color.values().length;
	}
	
}
