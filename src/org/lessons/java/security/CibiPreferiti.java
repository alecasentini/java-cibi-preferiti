package org.lessons.java.security;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] cibi = {"Pizza", "Hamburger", "Lasagne", "Cotoletta", "Tiramisu"};
		
		System.out.println("Numero cibi in classifica: " + cibi.length);
		
		System.out.println("Al primo posto: " + cibi[0]);
		
		System.out.println("All'ultimo posto: " + cibi[cibi.length-1]);
		
		System.out.println("In mezzo alla classifica: " + cibi[cibi.length/2]);
	}
}
