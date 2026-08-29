import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera calificación: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("El promedio final es: " + String.format("%.2f", promedio));

        if (promedio >= 12) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }

        scanner.close();
    }
}