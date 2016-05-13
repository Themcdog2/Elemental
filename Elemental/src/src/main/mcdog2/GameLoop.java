package src.main.mcdog2;

public class GameLoop implements Runnable{
	Thread t;
	
	private boolean isRunning = false;
	public GameLoop(){
		start();
		}
	
	public synchronized void start(){
		t = new Thread(this);
		t.start();
		isRunning = true;
	}
	
	public synchronized void stop(){
		isRunning = false;
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		long lastTime=System.nanoTime();
	    final double amountOfTicks=60.0;
	    double ns=1000000000/amountOfTicks;
	    double delta=0;
	    int updates=0;
	    int frames=0;
	    long timer=System.currentTimeMillis();
		while(isRunning){
	        long now=System.nanoTime();
	        delta+=(now-lastTime)/ns;
	        lastTime=now;
	        if(delta>=1){
	            tick();
	            updates++;
	            delta--;
	        }
	        sendRepaintRequest();
	        frames++;

	        if((System.currentTimeMillis()-timer)>1000){
	            timer+=1000;
	            System.out.println(updates+" Ticks, FPS "+frames);
	            updates=0;
	            frames=0;
	        }
	    }
	    stop();
		
	}
	
	private void sendRepaintRequest(){
		Main.frame.repaint();
	}
	
	private void tick(){
	
			for(Level e : Main.levels){
				for(GameObject j : e.getGameObjects()){
					j.update();
				}
		
			
		}
	}

}
