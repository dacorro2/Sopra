package AlgoritmosPack;

import java.util.Scanner;

public class SueldoTrabajador {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tarifa, salario;
        int horasTrabajadas;
        
        System.out.print("Ingrese las horas trabajadas: "); //Leer Horas trabajadas
        horasTrabajadas = sc.nextInt(); //cargar valor
        
        System.out.print("Ingrese la tarifa: "); //Leer tarifa
        tarifa = sc.nextDouble(); //cargar valor
        
        if (horasTrabajadas > 40) {
            salario = 40 * tarifa + (horasTrabajadas - 40) * tarifa * 1.5;
        } else {
            salario = horasTrabajadas * tarifa;
        }
        
        System.out.println("El salario del trabajador es: " + salario);
    }
}
