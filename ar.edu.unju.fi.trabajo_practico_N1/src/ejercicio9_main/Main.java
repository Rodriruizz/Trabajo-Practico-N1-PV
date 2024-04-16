package ejercicio9_main;
import java.util.Scanner;
import model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del producto " + i + ":");
            Producto producto = new Producto();

            System.out.println("Nombre:");
            producto.setNombre1(scanner.nextLine());

            System.out.println("Código:");
            producto.setCodigo(Integer.parseInt(scanner.nextLine()));

            System.out.println("Precio:");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));

            System.out.println("Descuento (valor entero entre 0 y 50):");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));

            // Mostrar los datos ingresados para el producto y el resultado del cálculo del descuento
            System.out.println("Datos del producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.getDescuento());
            System.out.println();
        }

        scanner.close();
    }
}