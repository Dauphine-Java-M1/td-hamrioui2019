package fr.dauphine.ja.hamriouiodile.shapes.model;

import java.util.ArrayList;

public class Point {
		
	    private int x,y; 
	    private static int cpt=0; 	    
	    /*je définis mes # constructeurs*/
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			this.cpt ++;
		}
		public Point() {}
		public Point(Point p) {
			this.x = p.x;
			this.y = p.y;	
		}
	   /*
	    * je genere mes getteurs et setteurs
	    */
		public void setX(int p) {
			x = p;
		}
		public static int getCpt() {
			return cpt;
		}
	
		public void setY(int p) {
			y = p;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		
		// question 2 exercice 2
		public boolean  isSameAs(Point p) {
			if ((this.x == p.x) && (this.y ==p.y))  return true ;
			return false;
		}
		
		/*
		 * en regardant la javadoc
		 * je redefinis ma methode equals
		 * de tel sorte à ce qu'elle puisse comparer deux points*/
		public boolean equals(Object o) {
			if(!(o instanceof Point))
				return false;
			Point p = (Point) o;
			return (x==p.x)&&(y==p.y);		
		}
		
		public void translate (int dx, int dy ) {
			this.x = dx;
			this.y = dy;
		}
		public Point translate2(int dx,int dy) {
			Point p = new Point(dx, dy);
			return p;
		}
		
		public String toString() {
			return "("+x+","+y+")";
		}

	    	
	    	 public static void main( String[] args )
	        {
	         	Point p=new Point(5,6);
	        	Point p2=new Point(5,6);
	        	
	        	System.out.println(p.x+" "+p.y);
	        	System.out.println("nbre de point crés est  "+Point.getCpt());
	        	System.out.println("("+p.x+","+p.y+")");
	        	
	    		//Partie 2 exo 2 
	    		Point p1=new Point(1,2);
	    		 
	    		Point p22=p1;
	    		Point p3=new Point(1,2);
	    		System.out.println(p1==p22);
	    		System.out.println(p1==p3);
	    		System.out.print("Avec isSameAS:");
	    		System.out.println(p1.isSameAs(p1));
	    		
	    		Point p11=new Point(1,2);
	    		Point p12=p1;
	    		Point p13=new Point(1,2);
	    		ArrayList<Point> list = new ArrayList<Point>();
	    		list.add(p11);
	    		list.add(p13);
	    		System.out.println(list.indexOf(p12));
	    		System.out.println(list.indexOf(p13));}
	    
}
