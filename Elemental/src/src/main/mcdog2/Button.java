package src.main.mcdog2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Button extends Rectangle{
	
	private String text;
	
	public Button(String text){
		super(0, 0, 0, 0);
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman", 0, width / 4));
		g.drawString(text, x, y + height - (height / 4));
		g.setColor(Color.BLACK);
	}
	

}
