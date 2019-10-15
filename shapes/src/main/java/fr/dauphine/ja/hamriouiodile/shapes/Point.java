package fr.dauphine.ja.hamriouiodile.shapes.shapes;


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

	public boolean isSameAs(Point a) {
		return true;
	}
	public static void main( String[] args )
    {
     	Point p=new Point(5,6);
    	Point p2=new Point(5,6);
    	
    	System.out.println(p.x+" "+p.y);
    	System.out.print("nbre de point crés est  "+Point.getNombreInstances());

	
    }

	
}
	

