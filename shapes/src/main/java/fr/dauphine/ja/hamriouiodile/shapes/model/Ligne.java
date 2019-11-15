package fr.dauphine.ja.hamriouiodile.shapes.model;

import java.util.*;

import fr.dauphine.ja.hamriouiodile.shapes.view.Drawer;


public class Ligne extends Shape{
        
        private Point tableau[];
        private  int  maxPoints;
        private  int n=0;
		private static Drawer d;
		
    	//j'utilise une LinkedList afin d'utiliser les methodes des listes dans l'ajout, la suppression 
		LinkedList <Point> list;
        public Ligne(){
        	super(d);                   
        }     
        
        public Ligne(int  maxPoints){
        	super(d);                   
        }     
        public int pointCapacity(Ligne l) {
        	return l.maxPoints;
        }
        
        public int nbPoints(Ligne l) {
        	return l.n;
        }
        
        public boolean contains (Point p) {
        	for (Point p2 : tableau) 
        		if(p.equals(p2)) return true; 
        	return false;
        }
        
        /*
         * AJOUT D'UN POINT DANS MA LISTE 
         */
        public void addPoints(Point p) {
	    	list.push(p);
	    	n=n+1; //j'incrémente la taille de ma liste 
	    }
        /*
         * public void addPoints(Point a) {
        		 n= n+1;
        		 if(n <= maxPoints) {
        			 list.push(a);	  
        			 System.out.println("OK ");	
        		 }
        		 else {
        			 System.out.println("NON OK ");
        		 }	 
        	 }
         */
        /*#############################           MAIN          #############################################*/
	    public static void main( String[] args )
	    {
	    	
	    	LinkedList <Point> list = new LinkedList<Point>() ; 
	    	Point p1=new Point(1,2);
	    	list.push(p1);	  
	    	System.out.println(list.contains(p1));   	
	    }
	

	




}
		
