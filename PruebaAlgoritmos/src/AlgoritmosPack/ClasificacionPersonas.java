package AlgoritmosPack;

import java.util.Scanner;

public class ClasificacionPersonas {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        Persona[] personas = new Persona[10]; //En este array se van a cargar los valores de las 50 personas
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            System.out.print("Ingrese el sexo (M/F) de la persona " + (i + 1) + ": ");
            personas[i].sexo = sc.nextLine().charAt(0);
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            personas[i].edad = sc.nextInt();
            sc.nextLine();
        }

        // Cálculo de las estadísticas
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int mujeres = 0;
        
        for (Persona p : personas) {
            if (p.edad >= 18) {
                mayoresEdad++;
                if (p.sexo == 'M') {
                    hombresMayores++;
                }
            } else {
                menoresEdad++;
                if (p.sexo == 'F') {
                    mujeresMenores++;
                }
            }
            if (p.sexo == 'F') {
                mujeres++;
            }
        }
        double porcentajeMayores = (double) mayoresEdad / personas.length * 100;
        double porcentajeMujeres = (double) mujeres / personas.length * 100;

        // Impresión de las estadísticas
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.printf("Porcentaje que representan las personas mayores de edad respecto al total de personas: %.2f%%\n", porcentajeMayores);
        System.out.printf("Porcentaje que representan las mujeres respecto al total de personas: %.2f%%\n", porcentajeMujeres);
    }
}
