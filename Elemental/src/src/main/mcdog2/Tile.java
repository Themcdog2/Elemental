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
		//g.drawImage(i, x, y, size, size, null);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public int getSize() {
		return size;
	}

	public Image getImage() {
		return i;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setTileX(int tileX) {
		this.tileX = tileX;
	}

	public void setTileY(int tileY) {
		this.tileY = tileY;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setImage(Image i) {
		this.i = i;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	

}
