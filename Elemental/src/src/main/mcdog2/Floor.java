package src.main.mcdog2;

import java.awt.Color;
import java.awt.Graphics;

public class Floor extends GameObject{

	public Floor(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
