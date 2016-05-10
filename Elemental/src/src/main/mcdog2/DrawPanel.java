package src.main.mcdog2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public DrawPanel(){
		
	}
	
	@Override
	public void paint(Graphics g){
		for(int i = 0; i < Main.getObjects().size(); i++){
			Main.getObjects().get(i).draw(g);
		}
	}

}
