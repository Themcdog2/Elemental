package src.main.mcdog2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public DrawPanel(){
		
	}
	
	@Override
	public void paint(Graphics g){
		for(int i = 0; i < Main.getGameObjects().size(); i++){
			Main.getGameObjects().get(i).draw(g);
		}
	}

}
