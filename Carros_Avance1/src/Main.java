import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n****\t1001 AUTOS\t****");
            opcion = inventario.opcionMenu(scanner);
            inventario.procesar(opcion, scanner);
        } while (opcion != 0);

        scanner.close();
    }
}
