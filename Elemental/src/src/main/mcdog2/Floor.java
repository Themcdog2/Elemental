package src.main.mcdog2;

import java.awt.Graphics;

public class Floor extends GameObject{

	public Floor(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(x, y, width, height);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
