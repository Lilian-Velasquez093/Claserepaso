import java.util.Scanner;

public class ElBuenSabor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite máximo de productos: ");
        int limite = scanner.nextInt();

        for (int i = 0; i < limite; i++) {
            System.out.println("\nProducto " + (i + 1));

            System.out.print("Nombre del producto: ");
            String nombre = scanner.next();

            System.out.print("Precio base: ");
            double precioBase = scanner.nextDouble();

            System.out.print("¿Tiene IVA? (1 para sí, 0 para no): ");
            int tieneIVA = scanner.nextInt();

            double iva = 0.0;
            if (tieneIVA == 1) {
                iva = precioBase * 0.12;
            }

            double imc = precioBase * 0.015;

            double precioFinal = precioBase + iva + imc;

            System.out.println("IVA: " + iva);
            System.out.println("IMC: " + imc);
            System.out.println("Precio final: " + precioFinal);
        }

        scanner.close();
    }
}