package fr.dauphine.ja.hamriouiodile.shapes.shapes;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private static int cpt=0;

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		cpt++;
	}
	public Point(Point a)
    {
       x = a.x;
       y = a.y;
    }
	public static int getNombreInstances()
	  {
	    return cpt;
	  }  

	public static boolean isSameAs(Point a, Point b) {
		return a.equals(b);
	}
	/*public static void main( String[] args )
    {
     	/*Point p=new Point(5,6);
    	//Point p2=new Point(5,6);
    	
    	System.out.println(p.x+" "+p.y);
    	System.out.println("nbre de point crés est  "+Point.getNombreInstances());
    	System.out.println("("+p.x+","+p.y+")");*/
	
		/*
		Partie 2 exo 2 
		Point p1=new Point(1,2);
		 
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.print("Avec isSameAS:");
		System.out.println(isSameAs(p1,p3));
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
    }
*/
	
}
	

