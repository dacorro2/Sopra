package AlgoritmosPack;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        
       //Entiendo que por instrucción "LEER NUMERO" quereis un scanner para pasar el número que queramos, guardando el valor en "numero".

        if (numero % 2 == 0) {  // Si el número es par
            for (int i = numero; i >= 0; i -= 2) {
            										//Solo se pide escribir los números, por tanto los pondrá en consola con un println
            	System.out.println(i);
            }
        } else {  									// Si el número es impar
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }

}
