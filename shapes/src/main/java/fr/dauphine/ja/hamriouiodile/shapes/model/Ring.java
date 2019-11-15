package fr.dauphine.ja.hamriouiodile.shapes.model;

public class Ring extends Cercle{
	
	private int  rayonInterne;
	private int  rayon;
	
	public Ring(Point p, int r, int rayonInterne) {
		super(r,p);
		if(rayonInterne<r) {
			this.rayonInterne 	= rayonInterne;
			this.rayon=r;
			//System.out.print("OK");
		}
	}
	public int getRayonInterne() {
		return rayonInterne;
	}
	public Cercle getCercle() {
		return new Cercle(super.getRayon(),super.getCentre());
		
	}
	public void setRayonInterne(int r) {
		this.rayonInterne = r ;
	}
	/*
	 * je redefinis ma methode equal pour qu'elle puisse comparer mes deux objets Ring 
	 */
		 public boolean equals(Ring g)
		  { 
		    if ((this.centre.equals(g.centre)& (this.rayon==g.rayon)&(this.rayonInterne==g.rayonInterne)))
		    { 
		      return true;
		    }
		    return false;
		  }

	
	public static void main( String[] args )
    {
		Point p = new Point(1,1); 
		Ring r = new Ring(p, 5,1);
		//Ring r2 = new Ring(p, 5,1);
		System.out.println(r);
		//System.out.println(r.equals(r2));

	}
}
