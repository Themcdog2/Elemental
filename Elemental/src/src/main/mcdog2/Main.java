package src.main.mcdog2;


import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	static JFrame frame;
	static Canvas canvas;
	
	static private ArrayList<testObject> obj;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new ArrayList<testObject>();
		init();
		
	}
	
	private static void init(){
		frame = new SkeletonFrame();
		testObject t = new testObject(0, 0, 100, 100);
		GameLoop gl = new GameLoop();
	}
	
	public static ArrayList<testObject> getObjects(){
		return obj;
	}
	
	public static void addObject(testObject r){
		obj.add(r);
	}

}
 