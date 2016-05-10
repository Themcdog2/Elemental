package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;

public abstract class GameObject {
	int x, y;
	int width, height;
	Image image;
	
	
	//Abstract methods
	public abstract void draw(Graphics g);
	public abstract void update();
	
	
	//Getters
	public int getX(){return x;};
	public int getY(){return y;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	//Setters
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y = y;}
	public void setWidth(int width){this.width = width;}
	public void setHeight(int height){this.height = height;}
	


}
