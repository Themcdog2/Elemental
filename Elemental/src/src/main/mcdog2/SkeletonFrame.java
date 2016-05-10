package src.main.mcdog2;

import java.awt.Dimension;

import javax.swing.JFrame;

public class SkeletonFrame extends JFrame{

	public SkeletonFrame(){
		this.setVisible(true);
		this.setSize(new Dimension(800,800));
		this.add(new DrawPanel());
	}
}
