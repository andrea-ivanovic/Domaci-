package domaciDrugiDeo;

import java.util.Scanner;

public class Zadatak_2_11192019 {

	public static void main(String[] args) {
		/*
		 *   Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza
		 *   koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza) 
		 */
        	Scanner sc= new Scanner (System.in);
        	System.out.println("Unesite duzinu niza");
        	
        	int duzinaNiza = sc.nextInt();
        	if (duzinaNiza <=0) {System.out.println("Unesite pozitivan broj, veci od 0.");}
        	else {
        	
        	int [] brojevi = new int [duzinaNiza];
        	int suma = 1;
        	for (int i = 0; i<duzinaNiza; i++) {
        		System.out.println("Unesite clanove niza");
        	
				brojevi[i] = sc.nextInt();   }   //popuni niz odredjene duzine , unetim brojevima
				
				 for (int i = 0; i < duzinaNiza; i++) {
					 if (brojevi[i] >i) // broj vs poz 
					 { suma = suma * brojevi[i];} 
				 }
				 System.out.println("Proizvod brojeva koji su veci od svoje pozicije je " + suma+ " .");
        }
}}