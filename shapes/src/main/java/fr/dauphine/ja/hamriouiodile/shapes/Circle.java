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
		return "c est un cercle de centre "+this.centre.afficher()+" de rayon "+this.rayon+" et une surface de : "+this.surface();
	}
	
	public Circle translate (int dx, int dy)
    {
       int x=this.centre.getX() + dx;
       int y=this.centre.getY() + dy;
       this.centre.setX(x);
       this.centre.setY(y);
       return this;
    }
	public Point getCenter() {
		return this.centre; 
	}
	public double surface() {
		return Math.PI*rayon*rayon;
	}
	/*
	 * public boolean contains(Point p) {
	je vais calculer la distance des coordonnées par rapport au centre puis j'utilise la distance euclédienne 
		int x=p.getX()-this.centre.getX();
		int y=p.getY()-this.centre.getY();
		double d=Math.pow(x, 2)+Math.pow(y, 2);
		return  
	}*/
	
	/*
	 * public boolean contains(Point p, liste ){
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	 public static void main( String[] args ) {
		/*Point p=new Point(1,2);
		 Circle c=new Circle(p,1);
		 Circle c2=new Circle(p,2);
		 c.translate(1,1);
		 System.out.println(c.toString()+" "+c); */
		/*
		 * question 6
		 Circle c=new Circle(p,1);
		 c.translate(1,1);
		 System.out.println(c);*/
		 Point p=new Point(1,2);
		 Circle c=new Circle(p,1);
		 Circle c2=new Circle(p,2);
		 c2.translate(1,1);
		 System.out.println(c+" "+c2);
	 }
}
