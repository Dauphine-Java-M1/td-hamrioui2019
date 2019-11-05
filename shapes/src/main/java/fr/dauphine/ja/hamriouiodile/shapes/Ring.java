package fr.dauphine.ja.hamriouiodile.shapes.shapes;

public class Ring {
	private Point centre;
	private double rayon;
	private double rayonInt;
	
	public Ring(Point c, double r, double ri) {
		this.centre=c;
		if (ri<r) {
			this.rayon=r;
			this.rayonInt=ri;
		}
		else {
			System.out.println("erreur");
		}
	}
	 public boolean equals(Ring g)
	  { 
	    if ((this.centre.equals(g.centre)& (this.rayon==g.rayon)&(this.rayonInt==g.rayonInt)))
	    { 
	      return true;
	    }
	    return false;
	  }
	 public String toString() {
			return "c est un anneau de centre "+this.centre.afficher()+" de rayon "+this.rayon+" et de rayon interne : "+this.rayonInt;
		}
	public static void main( String[] args ) {
		Point p=new Point(1,1);
		Ring ring= new Ring(p,3,2);
		System.out.println(ring);
	}
}

