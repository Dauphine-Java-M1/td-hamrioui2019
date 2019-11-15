package fr.dauphine.ja.hamriouiodile.shapes.model;

import fr.dauphine.ja.hamriouiodile.shapes.view.CircleDrawer;
import fr.dauphine.ja.hamriouiodile.shapes.view.Drawer;

public class Cercle extends Shape {
	protected int rayon;
	protected Point centre;
	private static Drawer d1;

	/*
	 * mon constructeur avec deux parametres un rayon et un point 
	 * je vais initialiser mon rayon et point aux valeurs en parametre 
	 * puis je crée une instance de circleDrawer de ma classe mère que j'instanci
	 */
	public Cercle(int rayon, Point p) {
		super(d1);
		this.rayon = rayon;
		this.centre = new Point(p);
		d1 = new CircleDrawer(this);
	}
	
	public int getRayon() {
		return rayon;
	}
	
	public Point getCentre() {
		return centre;
	}

	
	public String toString() {
		String res = " rayon= " +this.rayon+" le centre : ("+centre.getX()+","+centre.getY()+") et sa surface est :"+this.surface() ;
		return res;
	}
	// methode translate 
	public Cercle translate(int dx,int dy) {
		  int x=this.centre.getX() + dx;
	       int y=this.centre.getY() + dy;
	       this.centre.setX(x);
	       this.centre.setY(y);
	       return this;	
	}
	
	//en s'inspirant de la la doc java
	public boolean equals(Object o) {
		if(!(o instanceof Cercle)) return false;
		Cercle c =(Cercle) o ;
	    return (this.centre.equals(c.getCentre()))&&(this.rayon==c.getRayon());	
	}
	
	//calcule de la surface de mon cercle
	public double surface() {
		return Math.PI*rayon*rayon;
	}
	
	public boolean contains(Point p) {
		//je vais calculer la distance des coordonnées par rapport au centre puis j'utilise la distance euclédienne
		if(((java.lang.Math.sqrt(this.centre.getX()))-(java.lang.Math.sqrt(this.centre.getY()))<=rayon))
			return true ;
		return false;
	}
	
	public boolean contains(Point p,Cercle[] tableau) {
		for(Cercle c : tableau)
			 if(c.contains(p))
				 return true;
		return false;
	}
}
