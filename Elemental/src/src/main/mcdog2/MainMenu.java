package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class MainMenu {
	
	Rectangle startButton;
	Rectangle optionButton;
	Rectangle exitButton;
	
	public MainMenu(int screenWidth, int screenHeight){
		startButton = new Rectangle();
		optionButton = new Rectangle();
		exitButton = new Rectangle();
		reset(screenWidth, screenHeight);
	}
	
	public void reset(int screenWidth, int screenHeight){
		startButton.setSize(screenWidth / 10, screenHeight / 15);
		optionButton.setSize(screenWidth / 10, screenHeight / 15);
		exitButton.setSize(screenWidth / 10, screenHeight / 15);
		
		startButton.setLocation(screenWidth/2 - (startButton.width /2),  screenHeight / 2 - screenHeight / 4);
		optionButton.setLocation(screenWidth /2 - (optionButton.width /2), screenHeight / 2);
		exitButton.setLocation(screenWidth /2 - (exitButton.width /2), screenHeight / 2 + screenHeight / 4);

	}
	
	
	public void drawMenu(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(startButton);
		g2.fill(optionButton);
		g2.fill(exitButton);
	}

}
