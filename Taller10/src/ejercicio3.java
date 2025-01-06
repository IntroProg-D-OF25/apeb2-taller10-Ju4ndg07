
import java.util.Random;

public class ejercicio3{
    public static void main(String[] args) {
        int numEstudiantes = 5; // Para hacerlo más pequeño y fácil de entender

        String[] nombres = new String[numEstudiantes];
        double[] acd = new double[numEstudiantes];
        double[] ape = new double[numEstudiantes];
        double[] aa = new double[numEstudiantes];
        double[] promedios = new double[numEstudiantes];

        Random random = new Random();

        // Llenar datos
        for (int i = 0; i < numEstudiantes; i++) {
            nombres[i] = "Estudiante " + (i + 1);
            acd[i] = random.nextDouble() * 10;
            ape[i] = random.nextDouble() * 10;
            aa[i] = random.nextDouble() * 10;

            promedios[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
        }

        double sumaPromedios = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            sumaPromedios = sumaPromedios + promedios[i];

        }
        double promedioCurso = sumaPromedios / numEstudiantes;

        System.out.println("Promedio del curso: " + promedioCurso);

        System.out.println("\nEstudiantes por encima del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }

        System.out.println("\nEstudiantes por debajo del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
    }
}

/***
 * Promedio del curso: 5.509909212978411

Estudiantes por encima del promedio:
Estudiante 1 - Promedio: 6.0918392443055085
Estudiante 3 - Promedio: 6.7717051713842205
Estudiante 4 - Promedio: 6.110120777972201

Estudiantes por debajo del promedio:
Estudiante 2 - Promedio: 3.0991212568541013
Estudiante 5 - Promedio: 5.476759614376023
 */