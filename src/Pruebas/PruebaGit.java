package Pruebas;

import java.util.Scanner;

public class PruebaGit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		String nombre = sc.next();
		
		System.out.println("Hola " + nombre);
		sc.close();
	}
}