package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener{
	
	static MainMenu mainmenu;
	public DrawPanel(){
		mainmenu = new MainMenu(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.addMouseListener(this);
	}
	
	public static void requestResize(){
		mainmenu.reset(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	}
	
	@Override
	public void paint(Graphics g){
		for(int i = 0; i < Main.getGameObjects().size(); i++){
			Main.getGameObjects().get(i).draw(g);
		}
		
		if(Main.state == State.MAINMENU){
		mainmenu.drawMenu(g);
		}else{
			for(Level e : Main.levels){
				e.renderObjects(g);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		checkMainMenuClicks(e.getPoint());
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		checkMainMenuClicks(e.getPoint());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void checkMainMenuClicks(Point p){
		if(mainmenu.buttonClicked(p, "startButton")){
			mainmenu.setHidden(true);
			Main.state = State.LEVELSELECT;
		}
		if(mainmenu.buttonClicked(p, "optionButton")){
			Main.state = State.OPTIONMENU;
		}
		
		if(mainmenu.buttonClicked(p, "exitButton")){
			System.exit(0);
		}
	
	}

}
