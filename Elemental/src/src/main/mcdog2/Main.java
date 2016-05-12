package src.main.mcdog2;


import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	public static int SCREEN_WIDTH = 900;
	public static int SCREEN_HEIGHT = 600;
	static JFrame frame;
	static Canvas canvas;
	

	
	static private ArrayList<GameObject> obj;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new ArrayList<GameObject>();
		init();
		
	}
	
	private static void init(){
		frame = new SkeletonFrame();
		Player p = new Player(0, 0, 50, 50, Toolkit.getDefaultToolkit().getImage("tempstick.jpg"));
		addGameObject(p);
		GameLoop gl = new GameLoop();
	}
	
	public static ArrayList<GameObject> getGameObjects(){
		return obj;
	}
	
	public static void addGameObject(GameObject r){
		obj.add(r);
	}

}
 