package fr.dauphine.ja.hamriouiodile.td00;
import java.math.*;
import java.util.*;

public class PrimeCollection 
{
    public static void main( String[] args )
    {
       /* System.out.println( "Hello World!" );
        int toto;*/
        /*get + ctr espace cela m affiche les propositions */
        /*set +ctrl+esp m affiche les propositions ayant set comme facteur*/
        /*alt+shift+R m'affiche un script ou je peut renomer toutes els occurence de ma class pareil pour toto*/
        /*on renomme la classe en utilisant alt+shift+r sur app */
    	PrimeCollection pc=new PrimeCollection();
    	pc.initRandom(1, 100);
    	Iterator<Integer> iter=pc.numbers.iterator();
    	while(iter.hasNext()){
    		/*si je veux acceder a la valeur de mon iterateur j'utilise next()*/
    		if(!pc.isPrime(iter.next())){
    			System.out.print(pc.numbers);
    		}
    	}
    	
    	
    }
    public java.util.ArrayList<Integer> numbers=new ArrayList<Integer>();
    public PrimeCollection() {}
    
    /*public PrimeCollection() {
        	this.numbers=new ArrayList<Integer>();
    }*/
    public void initRandom(int n,int m) {
    	int rand;
    	rand= (int) (0+(Math.random())*((m - 0)+1));
    	numbers.add((Integer)rand);
    }
    private boolean isPrime(int p) {
    	int i,test;
    	test=0;
    	if(p%2==0) {
    		test=1;
    	}
    	else {
    		for (i =3; i < p; i=i+2) {
    			if(p%i==0) {
    	    		test=1;
    	    	}
    		}
    			if(test==0) {
    				return true;
    			}
    			else {
    				return false;
    			}
    	}
		return true;
    	
    }
}
