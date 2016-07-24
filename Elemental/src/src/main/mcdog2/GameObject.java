package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public abstract class GameObject{
	int x, y;
	int width, height;
	Image image;
	Rectangle collisionBox;
	

	ArrayList<Image> animation;
	private boolean animating;
	private Image defaultImage;
	
	ArrayList<Image> currentAnimation;
	



	private int animationDelay = 100000;
	private int animationStep = 0;
	
	public GameObject(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public GameObject(int x, int y, int width, int height, Image image){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.defaultImage = image;
	}
	//Abstract methods
	public abstract void draw(Graphics g);
	public abstract void update();
	
	
	//Getters
	public double getX(){return x;};
	public double getY(){return y;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	public Image getImage() {return image;}
	public int getAnimationDelay() {return animationDelay;}
	
	//Setters
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y = y;}
	public void setWidth(int width){this.width = width;}
	public void setHeight(int height){this.height = height;}
	public ArrayList<Image> getAnimation() {return animation;}
	public void setAnimation(ArrayList<Image> animation) {this.animation = animation;}
	public void setImage(Image image) {this.image = image;}
	public void setAnimationDelay(int animationDelay) {this.animationDelay = animationDelay;}

	public boolean isAnimating() {
		return animating;
	}

	public void setAnimating(boolean animating) {
		this.animating = animating;
	}

	
	public ArrayList<Image> loadAnimation(String directory, String name, String type, int frames){
		animation = new ArrayList<Image>();
		System.out.println(directory + "/" + name + " (" + frames + ")" + type);
		for(int i = 1; i <= frames; i++){
			animation.add(Toolkit.getDefaultToolkit().getImage(directory + "/" + name + " (" + i + ")" + type));
		}
		return animation;
	}
	
	
	public ArrayList<Image> getCurrentAnimation() {
		return currentAnimation;
	}

	public void setCurrentAnimation(ArrayList<Image> currentAnimation) {
		this.currentAnimation = currentAnimation;
	}

	public void cycleAnimation(){
		
		
		Timer t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			
		

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ArrayList<Image> images = currentAnimation;
				if(animationStep < images.size()){
					if(animating){
						setImage(images.get(animationStep));
						animationStep++;
					}else{
						setImage(defaultImage);
						
					}
				}else{
					animationStep = 0;
				}
			}
		}, 0, 25);
	}
	


	public Rectangle getBounds(){
		return new Rectangle(x, y, width, height);
	}
	
	
	

	public boolean intersects(GameObject other){
		if(this.getBounds().intersects(other.getBounds())){
			return true;
		}
		return false;
	}


}
