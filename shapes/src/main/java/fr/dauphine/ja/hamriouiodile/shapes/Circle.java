package fr.dauphine.ja.hamriouiodile.shapes.shapes;

public class Circle {
	private Point centre;
	private double rayon;
	
	public Circle(Point c, double r) {
		this.centre=c;
		this.rayon=r;
	}
	public Circle() {}
	public String toString() {
		return "c est un cercle de centre "+this.centre.afficher()+" et de rayon "+this.rayon;
	}
	static Circle translate (Circle c, int dx, int dy)
    {
       Circle c1 = new Circle ();
       int x=c.centre.getX() + dx;
       int y=c.centre.getY() + dy;
       c1.centre.setX(x);
       c1.centre.setY(y);
       return c1;
    }
	public Point getCenter() {
		return this.centre; 
		
	}
	 public static void main( String[] args ) {
		 Point p=new Point(1,2);
		 Circle c=new Circle(p,1);
		 Circle c2=new Circle(p,2);
		// translate(c2,1,1);
		 System.out.println(c.toString()+" "+c2); 
	 }
	
}
