package src.main.mcdog2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	static MainMenu mainmenu;
	public DrawPanel(){
		mainmenu = new MainMenu(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	}
	
	public static void requestResize(){
		mainmenu.reset(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	}
	
	@Override
	public void paint(Graphics g){
		for(int i = 0; i < Main.getGameObjects().size(); i++){
			Main.getGameObjects().get(i).draw(g);
		}
		mainmenu.drawMenu(g);
	}

}
