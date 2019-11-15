package fr.dauphine.ja.hamriouiodile.shapes.view;

import javax.swing.*;

import fr.dauphine.ja.hamriouiodile.shapes.controller.MouseController;
import fr.dauphine.ja.hamriouiodile.shapes.model.World;

import java.awt.*;

public class MyDisplay extends JPanel{

	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = -6180330743174068042L;
	World monde; 
	public MyDisplay(World monde){
		this.monde = monde;
	}

	public  void paintComponent(Graphics g) {
		
		//pour dessiner j appelle la fonction paint component que j'initialise avec mon graphic
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawLine(200, 200, 180, 300);
		g.setColor(Color.RED);
		g.drawOval(180,150, 50,50);
		
		//Point p =new Point(1,2);
    }
	public static void main(String []args){
		World monde = new World();
		JFrame frame = new JFrame("AFFICHAGE");
		frame.setBackground(Color.WHITE);
		frame.setSize(new Dimension(500,500));
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(monde);
		frame.add(d);

		MouseController m = new MouseController(monde, frame) ; 
		monde.getShapes();
		}

}
