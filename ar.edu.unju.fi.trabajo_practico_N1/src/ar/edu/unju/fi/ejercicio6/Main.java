package ar.edu.unju.fi.ejercicio6;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    public Persona() {
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona persona1 = new Persona();
        System.out.println("Ingrese DNI:");
        persona1.setDni(scanner.nextLine());
        System.out.println("Ingrese Nombre:");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese Fecha de Nacimiento (yyyy-mm-dd):");
        persona1.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
        persona1.mostrarDatos();

        System.out.println("Ingrese DNI:");
        String dni = scanner.nextLine();
        System.out.println("Ingrese Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese Fecha de Nacimiento (yyyy-mm-dd):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese Provincia:");
        String provincia = scanner.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona2.mostrarDatos();

        System.out.println("Ingrese DNI:");
        dni = scanner.nextLine();
        System.out.println("Ingrese Nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese Fecha de Nacimiento (yyyy-mm-dd):");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();

        scanner.close();
    }
}