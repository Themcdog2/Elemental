package src.main.mcdog2;


import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	public static int SCREEN_WIDTH = 900;
	public static int SCREEN_HEIGHT = 600;
	static JFrame frame;
	static Canvas canvas;
	

	static State state = State.MAINMENU;
	static private ArrayList<GameObject> obj;
	static public ArrayList<Level> levels;
	
	
	static int currentLevel = 0;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new ArrayList<GameObject>();
		init();
		
	}
	
	private static void init(){
		frame = new SkeletonFrame();
		GameLoop gl = new GameLoop();
		levels = new ArrayList<Level>();
	}
	
	public static void initLevels(){
		levels.add(new Level("Test level"));
		GameObject floor = new Floor(0, 400, SCREEN_WIDTH, 50);
		levels.get(currentLevel).addGameObject(floor);
		//System.out.println(levels.get(currentLevel).getGameObjects());
		Player p = new Player(0, 0, 50, 50, Toolkit.getDefaultToolkit().getImage("tempstick.jpg"));
		levels.get(currentLevel).addGameObject(p);
	}
	
	public static ArrayList<GameObject> getGameObjects(){
		return obj;
	}
	
	public static void addGameObject(GameObject r){
		obj.add(r);
	}

}
 