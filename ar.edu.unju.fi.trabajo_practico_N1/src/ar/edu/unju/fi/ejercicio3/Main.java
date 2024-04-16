package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	    
	System.out.println("ingrese un numero: ");
		
	int resultado, numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			resultado = numero * 3;
			System.out.println("su numero es par "); 
			
		}else{
			resultado = numero * 2;
			System.out.println("su numero es impar ");
	}
	
	System.out.println("el resultado es: "+ resultado);
	
scanner.close();
	}

}