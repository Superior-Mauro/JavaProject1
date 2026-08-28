import java.util.Scanner;

public class BecaPorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 17) {
            System.out.println("¡Felicidades! SÍ obtendrá la beca.");
        } else {
            System.out.println("Lo sentimos, la nota no es mayor a 17, por lo que NO obtendrá la beca.");
        }
        
        scanner.close();
    }
}