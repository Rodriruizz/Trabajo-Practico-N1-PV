package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("ingrese un numero del 1 al 10 para calcular su factorial: ");
				
		int numero = scanner.nextInt();
		
		if (numero >= 0 && numero <=10) {
		int factorial = 1, i = 1;
		
				while (i <= numero) {
					
					factorial = factorial * i;
					i++;
				}
		System.out.println("resultado es: "+ factorial);
		
		}else{
			System.out.println("el numero no esta en el rango deseado.");
		}
		scanner.close();
	}
}