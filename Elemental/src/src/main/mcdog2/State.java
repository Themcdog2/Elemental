package src.main.mcdog2;

public enum State {
 MAINMENU(0), OPTIONMENU(1), LEVELSELECT(2), INGAME(3);
	private int value; 
	private State(int value) { this.value = value; }
};
