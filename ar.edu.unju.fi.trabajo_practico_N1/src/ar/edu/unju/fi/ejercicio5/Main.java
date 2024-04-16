package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero del 1 al 9 para mostrar su tabla de multiplicar");
		int numero = scanner.nextInt();
		int resultado;
		
			if (numero >= 1 && numero <= 9) {
				for (int i = 0; i <= 10; i++) {
					resultado = i * numero;
					System.out.println(numero+" x "+i+" = "+resultado);
				}
			}else{
				System.out.println("su numero no esta en el rango deseado.");
			}
			scanner.close();
	}
}