package fr.dauphine.ja.hamriouiodile.shapes.shapes;

public class LigneBrisee {
	 private Point[] ligneBrisee ;
	 private int n;
	 private int taille;
	 /*Constructeur de la classe prenant 2 param un tableau de point et la taille de celui ci */
	 public LigneBrisee(int n) {
		 this.taille=0;
		 this.n=n;
		 this.ligneBrisee= new Point[n];
	 }
	 /*methode qui ajoute un  point dans une ligne */
	 private void add(Point a) {
		 taille= taille+1;
		 if(taille <= n) {
			 ligneBrisee[taille]=a;
			 //System.out.println("OK ");
			
		 }
		 else {
			 //System.out.println("NON OK ");
		 }	 
	 }
	 //retourne la capacité max de la ligne brisée
	 private int pointCapacity() {
		 return n;			 
	 }
	 //retourne le nombre de point dans la ligne 
	 private int nbPoints() {
		 return taille;			 
	 }
	 //METHODE INDIQUANT SI UN POINT PASSÉ EN ARGUMENT EST CONTENU DANS LA LIGNE 
	 private boolean contains(Point a) {
		 for (Point point : ligneBrisee) {
			if(point.equals(a)) {
				return true;
			}
		}
		return false;
	 }
	 
	 public static void main( String[] args ) {
		 //INSTANCIATION D UNE LIGNE 
		 LigneBrisee l1= new LigneBrisee(5);
		 //INSTANCIATION DES POINT 
		 Point p1=new Point(0,1);
		 Point p2=new Point(1,1);
		 Point p3=new Point(2,1);
		 //AJOUT DES POINT DANS LA LIGNE
		 l1.add(p1);
		 l1.add(p2);
		 l1.add(p3);
		 //AFFICHAGE DE LA CAPACITÉ DE LA LIGNE ET DE SA TAILLE ACTUELLE
		 System.out.println("lA CAPACITÉ ="+l1.pointCapacity()+"  ET LE NOMBRE DE POINT ="+l1.nbPoints());
		 
		 		 
	 }
	 

}
