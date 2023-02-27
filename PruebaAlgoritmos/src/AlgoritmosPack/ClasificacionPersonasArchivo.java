package AlgoritmosPack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClasificacionPersonasArchivo {
	public static void main(String[] args) {
        Persona[] personas = new Persona[50]; //array donde se van a guardar las personas sacadas del archivo txt
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;  //los contadores
        int mujeresMenores = 0;
        int mujeres = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("resources//personas.txt"))) {  
        	//lectura del archivo TXT que contiene el sexo y edad de las 50 personas
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < 50) {
                String[] datos = line.split(" ");
                personas[i] = new Persona();
                personas[i].sexo = datos[0].charAt(0);
                personas[i].edad = Integer.parseInt(datos[1]); //llenado del array con los datos del txt
                // Comprobaciones para los contadores
                if (personas[i].edad >= 18) {
                    mayoresDeEdad++;
                    if (personas[i].sexo == 'M') {
                        hombresMayores++;
                    }
                } else {
                    menoresDeEdad++;
                    if (personas[i].sexo == 'F') {
                        mujeresMenores++;
                    }
                }
                if (personas[i].sexo == 'F') {
                    mujeres++;
                }
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        double porcentajeMayores = (mayoresDeEdad * 100.0) / 50.0;
        double porcentajeMujeres = (mujeres * 100.0) / 50.0;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
    }

}

