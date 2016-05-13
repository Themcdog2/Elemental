package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Player extends GameObject{

	
	public Player(int x, int y, int width, int height, Image image){
		super(x, y, width, height, image);
	}
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, x, y, width, height, null);
		//g.fillRect(0, 0, 10, 10);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(checkForCollision(Main.levels.get(Main.currentLevel).getGameObjects()) == null){
			y++;
			
		}
		
	}
	
	private GameObject checkForCollision(ArrayList<GameObject> gameObjects){

		for(GameObject e : gameObjects){
			if(this.intersects(e) && !(this.equals(e))){
				return e;
			}
		}
		
		return null;
	}



}
