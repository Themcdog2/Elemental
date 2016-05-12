package src.main.mcdog2;

import java.awt.Graphics;
import java.util.ArrayList;

public class Level {
	
	private String levelID;
	private ArrayList<GameObject> gameObjects;
	
	public Level(String levelID) {
		this.levelID = levelID;
		gameObjects = new ArrayList<GameObject>();
	}
	
	public ArrayList<GameObject> getGameObjects(){
		return gameObjects;
		
	}
	
	public void addGameObject(GameObject e){
		gameObjects.add(e);
	}
	public void removeGameObject(int index){
		gameObjects.remove(index);
	}
	
	public void setLevelID(String levelID){
		this.levelID = levelID;
	}
	
	public String getLevelID(){
		return levelID;
	}

	public void renderObjects(Graphics g) {
		for(GameObject e : gameObjects){
			e.draw(g);
		}
		
	}
	

}
