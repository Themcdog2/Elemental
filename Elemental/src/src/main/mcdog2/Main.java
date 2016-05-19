package src.main.mcdog2;


import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	public static int SCREEN_WIDTH = 800; //800
	public static int SCREEN_HEIGHT = 640; //640
	
	public static int TILE_SIZE = 32;
	
	
	
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
		
		Image tempImage = Toolkit.getDefaultToolkit().getImage("eg_hieropole1.png");
		ArrayList<Tile> tempTiles = new ArrayList<Tile>();
		for(int i = 0; i < SCREEN_WIDTH / TILE_SIZE; i++){
			for(int j = 0; j < SCREEN_HEIGHT / TILE_SIZE; j++){
				tempTiles.add(new Tile(TILE_SIZE * i, TILE_SIZE * j, i, j, TILE_SIZE, tempImage, true));
			}
		}
		levels.get(currentLevel).setTiles(tempTiles);
		}
	
	public static ArrayList<GameObject> getGameObjects(){
		return obj;
	}
	
	public static void addGameObject(GameObject r){
		obj.add(r);
	}

}
 