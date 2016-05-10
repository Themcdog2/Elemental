package src.main.mcdog2;

import java.awt.Graphics;
import java.awt.Rectangle;

public class testObject extends Rectangle{
	
	int dx = 1;
	int dy = 1;
	
	public testObject(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		Main.addObject(this);
	}
	
	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}
	public void update(){
		if(x < 0){
			dx = Math.abs(dx);
		}
		if((x + width) > Main.WIDTH){
			dx = -dx;
		}
		
		if(y < 0){
			dy = Math.abs(dy);
		}
		if((y + height) > Main.HEIGHT){
			dy = -dy;
		}
		
		
		System.out.println(dx + " " + x);
		x += dx;
		y += dy;
		
		
	}

}
