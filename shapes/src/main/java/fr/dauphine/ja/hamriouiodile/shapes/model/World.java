package fr.dauphine.ja.hamriouiodile.shapes.model;

import java.util.ArrayList;

public class World {
	
	/*
	 * je créée une arraylist de shapes et je vais 
	 * construire mon monde avec ces differentes formes
	 * */
	public ArrayList<Shape>  shapes;
	
	public World() {
		ArrayList<Shape> shapes = new ArrayList<Shape>(); 
		shapes.add(new Cercle(10,(new Point(1,2))));
		shapes.add(new Cercle(30,(new Point(1,1))));
	}
	
	/*
	 * Pour savoir de quoi est constituté mon monde 
	 * il me faut retourner le contenue de monde à savoir mes formes
	 * */
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
}
