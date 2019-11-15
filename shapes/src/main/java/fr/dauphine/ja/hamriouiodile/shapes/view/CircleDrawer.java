package fr.dauphine.ja.hamriouiodile.shapes.view;

import java.awt.*;

import fr.dauphine.ja.hamriouiodile.shapes.model.Cercle;
;

public class CircleDrawer implements Drawer{
	public Cercle cercle;
	
	public CircleDrawer(Cercle cercle) {
		this.cercle = cercle;
	}
	public void draw(Graphics g) {

	    g.drawOval(50,50, 50, 50);
	}
}
