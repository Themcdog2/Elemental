package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Image;

public class Tile {
	
	int x;
	int y;
	int tileX;
	int tileY;
	int size;
	Image i;
	
	boolean isEmpty;
	
	public Tile(int x, int y, int tileX, int tileY, int size, Image i, boolean isEmpty){
		this.x = x;
		this.y = y;
		this.tileX = tileX;
		this.tileY = tileY;
		this.size = size;
		this.i = i;
		this.isEmpty = isEmpty;
		System.out.println(x + " " + y + " " + tileX + " " + tileY);
	}
	
	public void draw(Graphics g){
		g.drawImage(i, x, y, size, size, null);
	}
	

}
