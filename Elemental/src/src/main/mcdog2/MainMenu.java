package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
	
	public class MainMenu {
		
		private boolean hidden;
		
		Button startButton;
		Button optionButton;
		Button exitButton;
		public MainMenu(){
			hidden = false;
		}
	
	public boolean buttonClicked(Point p, String button){
		if(button.equalsIgnoreCase("startButton")){
			if(startButton.contains(p)){
				return true;
			}
		}else if(button.equalsIgnoreCase("optionButton")){
			if(optionButton.contains(p)){
				return true;
			}
		}else if(button.equalsIgnoreCase("exitButton")){
			if(exitButton.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	public void setHidden(boolean hidden){
		this.hidden = hidden;
	}
	
	public boolean getHidden(){
		return hidden;
	}
	
	
	public MainMenu(int screenWidth, int screenHeight){
		startButton = new Button("Start");
		optionButton = new Button("Options");
		exitButton = new Button("Exit");
		reset(screenWidth, screenHeight);
	}
	
	public void reset(int screenWidth, int screenHeight){
		startButton.setSize(screenWidth / 6, screenHeight / 15);
		optionButton.setSize(screenWidth / 6, screenHeight / 15);
		exitButton.setSize(screenWidth / 6, screenHeight / 15);
		
		startButton.setLocation(screenWidth/2 - (startButton.width /2),  screenHeight / 2 - screenHeight / 6);
		optionButton.setLocation(screenWidth /2 - (optionButton.width /2), screenHeight / 2);
		exitButton.setLocation(screenWidth /2 - (exitButton.width /2), screenHeight / 2 + screenHeight / 6);

	}
	
	
	public void drawMenu(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		startButton.draw(g2);
		optionButton.draw(g2);
		exitButton.draw(g2);
	}

}
