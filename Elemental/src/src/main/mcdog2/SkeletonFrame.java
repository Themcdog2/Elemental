package src.main.mcdog2;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

public class SkeletonFrame extends JFrame implements ComponentListener{

	public SkeletonFrame(){
		this.setVisible(true);
		this.setSize(new Dimension(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT));
		this.add(new DrawPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addComponentListener(this);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		Main.SCREEN_WIDTH = this.getWidth();
		Main.SCREEN_HEIGHT = this.getHeight();
		DrawPanel.requestResize();
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
