package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Player extends GameObject{
	
	
	float dx = 0;
	float dy = 0;
	float jumpVelocity;

	
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
		
		
		if(DrawPanel.keysPressed[3] == true){
			//System.out.println(DrawPanel.keysPressed[3]);
			dx +=0.5;
		}else{
			if(dx > 0){
				dx--;
			}
		}
		
		if(DrawPanel.keysPressed[1] == true){
			//System.out.println(DrawPanel.keysPressed[3]);
			dx -=0.5;
		}else{
			if(dx < 0){
				dx++;
			}
		}
		
		if(checkForCollision(Main.levels.get(Main.currentLevel).getGameObjects()) == null){
			dy++;
			dy *= 0.5;
			
		}else{
			//dy=0;
		}
		
		//Step y
		 
		if (dy > 0) {
			for (int ystep = 0; ystep < dy; ystep++) {
				if(checkForCollision(Main.levels.get(Main.currentLevel).getGameObjects()) == null){
				y++;
				}
			}
			dy = 0;
		}
		
		if (dy < 0) {
			for (int ystep = 0; ystep < dy; ystep++) {
				if(checkForCollision(Main.levels.get(Main.currentLevel).getGameObjects()) == null){
					y--;
					}
			}
			dy = 0;
		}
		
		x +=dx;
		
		
		
		
		
		
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
