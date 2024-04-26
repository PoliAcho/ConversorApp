import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        String codigoPaisDesde = "";
        String codigoPaisHasta = "";
        salida:
        while (opcion != 9) {
            Servicios.muestraMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    codigoPaisDesde = "USD";
                    codigoPaisHasta = "ARS";
                    break;
                case 2:
                    codigoPaisDesde = "ARS";
                    codigoPaisHasta = "USD";
                    break;
                case 3:
                    codigoPaisDesde = "USD";
                    codigoPaisHasta = "BRL";
                    break;
                case 4:
                    codigoPaisDesde = "BRL";
                    codigoPaisHasta = "USD";
                    break;
                case 5:
                    codigoPaisDesde = "USD";
                    codigoPaisHasta = "COP";
                    break;
                case 6:
                    codigoPaisDesde = "COP";
                    codigoPaisHasta = "USD";
                    break;
                case 9:
                    System.out.println("¡Gracias por usar nuestro servicio!");
                    break salida;
                default:
                    System.out.println("ERROR: Opción no válida.");
            }
            if (opcion < 7 && opcion > 0) {
                System.out.print("            Ingrese el importe: ");
                double importe = leer.nextDouble();
                System.out.println("        El valor convertido es: "
                        + ConversionMoneda.conversion(codigoPaisDesde,importe,codigoPaisHasta));
            }
        }
    }
}
