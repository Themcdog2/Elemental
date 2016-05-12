package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;

public abstract class GameObject extends Rectangle{
	int x, y;
	int width, height;
	Image image;
	
	
	//Abstract methods
	public abstract void draw(Graphics g);
	public abstract void update();
	
	
	//Getters
	public double getX(){return x;};
	public double getY(){return y;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	//Setters
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y = y;}
	public void setWidth(int width){this.width = width;}
	public void setHeight(int height){this.height = height;}
	


}
