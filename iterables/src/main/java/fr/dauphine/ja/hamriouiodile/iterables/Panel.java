package fr.dauphine.ja.hamriouiodile.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Panel<E> implements Iterator<Integer>{

	private int a;
	private int b;
	private int courant;
	
	public Panel(int a, int b) {
		this.a=a;
		this.b=b; 
		this.courant=this.a;
	}
	public static Iterator<Integer> panel1(int a, int b){
		return new Panel(a,b);
	}
		


	public boolean hasNext() {
		return this.courant<=this.b;
	}

	public Integer next() {
		if(this.hasNext()) {
		  return this.courant++;
		}
		throw new NoSuchElementException();

	}

	public static void main(String[] args) {
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
	}
}
