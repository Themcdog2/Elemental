package src.main.mcdog2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Level {
	
	private String levelID;
	private ArrayList<GameObject> gameObjects;
	private ArrayList<Tile> tiles;
	
	
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
		g.setColor(Color.white);
		g.fillRect(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		for(Tile e : tiles){
			e.draw(g);
		}
		for(GameObject e : gameObjects){
			e.draw(g);
		}
		
	}
	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tiles) {
		this.tiles = tiles;
	}
	
	public Tile getTileAt(int tileX, int tileY){
	if(tiles != null){
		for(int i = 0; i < tiles.size(); i++){
			if(tiles.get(i).tileX == tileX && tiles.get(i).tileX == tileY){
				return tiles.get(i);
			}
		}
		return null;
	}
	return null;
}
	

	
	

}
