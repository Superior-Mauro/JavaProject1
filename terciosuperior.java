import java.util.Arrays;
import java.util.Scanner;

public class TercioQuintoSuperior {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        double[] promedios = new double[cantidadAlumnos];

        // Ingresar promedios
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            promedios[i] = scanner.nextDouble();
        }

        System.out.print("Ingrese el número del alumno que desea evaluar: ");
        int alumnoEvaluar = scanner.nextInt();

        // Validar alumno
        if (alumnoEvaluar < 1 || alumnoEvaluar > cantidadAlumnos) {
            System.out.println("Alumno no válido.");
            scanner.close();
            return;
        }

        double promedioAlumno = promedios[alumnoEvaluar - 1];

        // Copiar arreglo para no modificar el original
        double[] ordenados = Arrays.copyOf(promedios, promedios.length);

        // Ordenar de menor a mayor
        Arrays.sort(ordenados);

        // Calcular posición del alumno
        int posicion = 1;

        for (double promedio : promedios) {
            if (promedio > promedioAlumno) {
                posicion++;
            }
        }

        // Cantidad de alumnos que pertenecen a cada grupo
        int cantidadQuinto = (int) Math.ceil(cantidadAlumnos / 5.0);
        int cantidadTercio = (int) Math.ceil(cantidadAlumnos / 3.0);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Promedio: " + String.format("%.2f", promedioAlumno));
        System.out.println("Posición: " + posicion + " de " + cantidadAlumnos);

        if (posicion <= cantidadQuinto) {
            System.out.println("Clasificación: Quinto Superior");
            System.out.println("También pertenece al Tercio Superior");
        } else if (posicion <= cantidadTercio) {
            System.out.println("Clasificación: Tercio Superior");
        } else {
            System.out.println("Clasificación: No pertenece al Tercio ni Quinto Superior");
        }

        scanner.close();
    }
}