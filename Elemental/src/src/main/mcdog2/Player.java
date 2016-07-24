package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Player extends GameObject{
	
	Vector2D position = new Vector2D(x, y);
	Vector2D velocity = new Vector2D(0.0, 0.0);
	float jumpVelocity;
	boolean jumping;
	
	ArrayList<Image> animationLeft;
	ArrayList<Image> animationRight;

	
	public Player(int x, int y, int width, int height, Image image){
		super(x, y, width, height, image);
		animationRight = loadAnimation("runRight", "run", ".gif", 9);
		animationLeft = loadAnimation("runLeft", "run", ".gif", 9);
		setCurrentAnimation(animationRight);
		cycleAnimation();
		update();
	}
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, x, y, width, height, null);
		//g.fillRect(0, 0, 10, 10);
	}

	@Override
	public void update() {
	//System.out.println(checkForCollision(Main.currentLevelObject.getGameObjects()));
		
		//If we are not colliding with anything, apply gravity
		if((checkForCollision(Main.currentLevelObject.getGameObjects()) == null)){
			velocity = velocity.add(new Vector2D(0.0, 1.0));
		}
		
		// W
		if (DrawPanel.keysPressed[0]) {
			velocity = velocity.add(new Vector2D(0.0, -20.0));
			DrawPanel.keysPressed[0] = false;
			jumping = true;
		}

		// A
		if (DrawPanel.keysPressed[1]) {
			velocity = velocity.add(new Vector2D(-1.0, 0.0));
			
			setCurrentAnimation(animationLeft);
			setAnimating(true);
			
			
		}

		// S
		if (DrawPanel.keysPressed[2]) {
			velocity = velocity.add(new Vector2D(0.0, 0.0));
		}

		// D
		if (DrawPanel.keysPressed[3]) {
			velocity = velocity.add(new Vector2D(1.0, 0.0));
			
			setCurrentAnimation(animationRight);
			setAnimating(true);
		}
		
		if(DrawPanel.keysPressed[0] == false && DrawPanel.keysPressed[1] == false && DrawPanel.keysPressed[2] == false && DrawPanel.keysPressed[3] == false){
			setAnimating(false);
		}
		
		
		
		
		
		
		
		//Finished logic, now step X.
	if(velocity.dX > 0){
		for(int i = 0; i < velocity.dX; i+=1){
				x+=1;		
				//Friction
					velocity = velocity.add(new Vector2D(-0.1, 0.0));

	}
}
	
	if(velocity.dX < 0){
		for(int i = 0; i > velocity.dX; i-=1){
				x-=1;
				//Friction
					velocity = velocity.add(new Vector2D(0.1, 0.0));
		}
	}
	
		//Step y
	if(velocity.dY > 0){
		for(int i = 0; i < velocity.dY; i+=1){
			if((checkForCollision(Main.currentLevelObject.getGameObjects()) == null)){
				y+=1;
			}else{
				velocity.dY = 0;
			}
		}
	}
	
	if(velocity.dY < 0){
		for(int i = 0; i > velocity.dY; i-=1){
			if((checkForCollision(Main.currentLevelObject.getGameObjects()) == null) || jumping){
				y-=1;
			}else{
				velocity.dY = 0;
			}
		}
	}
		
		
		//x = (int)position.dX;
		//y = (int)position.dY;
		System.out.println(velocity  + " " + position);
		if(this.x > Main.SCREEN_WIDTH){
			this.x = 0;
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
