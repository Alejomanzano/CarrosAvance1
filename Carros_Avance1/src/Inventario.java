import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private final ArrayList<Producto> productos = new ArrayList<>();

    public int opcionMenu(Scanner scanner) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ingresar auto");
        System.out.println("2. Mostrar autos");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public void procesar(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1 -> ingresar(scanner);
            case 2 -> mostrar();
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida.");
        }
    }

    public void ingresar(Scanner scanner) {
        System.out.print("Ingrese la marca del auto: ");
        String marca = scanner.next();
        System.out.print("Ingrese el modelo del auto: ");
        String modelo = scanner.next();
        System.out.print("Ingrese el tipo de auto: ");
        String tipo = scanner.next();
        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();
        System.out.print("Ingrese el precio: $");
        float precio = scanner.nextFloat();

        productos.add(new Producto(marca, modelo, tipo, year, precio));
        System.out.println("Auto ingresado con éxito.");
    }

    public void mostrar() {
        if (productos.isEmpty()) {
            System.out.println("No existen autos para mostrar.");
            return;
        }

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("--Auto " + (i + 1) + "--");
            System.out.println(productos.get(i));
        }
    }


}
