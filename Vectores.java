import java.util.Scanner;

public class Vectores {
      
    public static void main (String[] args) {
        
        try (Scanner Lector = new Scanner(System.in)) {

            //===========================
            //1 Crear y llenar vectores
            //===========================
            
            //Creacion de un vector de 15 numeros enteros
            int[] vector = new int[15];

            System.out.println ("=== LLENAR VECTOR ===");

            // Ciclo para llenar las 15 posiciones del vector
            for (int i = 0; i < vector.length; i++) {

                // Solicitar al usuario un número
                System.out.print("Ingrese el valor para la posicion  [" + i +"] (entre 10 y 100): ");
                int numero = Lector.nextInt();

                // Verificar que el número esté entre 10 y 100
                while (numero < 10 || numero > 100) {
                    // Mostrar mensaje si el número está fuera del rango
                    System.out.println("El número está fuera del rango.");

                    // Volver a solicitar el número
                    System.out.print("Ingrese nuevamente el número: ");
                    numero = Lector.nextInt();
                }

                while (numero < 10 || numero > 100);

                // Guardamos el número en el vector
                vector[i] = numero;
            }

            // Mostramos el vector completo
            System.out.println("\n=== VECTOR INGRESADO ===");

            for (int i = 0; i < vector.length; i++) {
                System.out.println("Posición " + i + ": " + vector[i]);
            }

            //================================
            // 2 Buscar un Valor en el vector
            //================================

            System.out.println("\n=== BUSCAR UN VALOR ===");

            System.out.print("Ingrese el número que desea buscar: ");
            int buscar = Lector.nextInt();

            boolean encontrado = false;

            // Recorremos el vector buscando el número
            for (int i = 0; i < vector.length; i++) {

                if (vector[i] == buscar) {
                    System.out.println("El número " + buscar
                            + " se encuentra en la posición " + i);
                    encontrado = true;
                }
            }

            // Si no encontramos el número
            if (encontrado == false) {
                System.out.println("El número " + buscar
                        + " no se encuentra en el vector.");
            }
        }

    }
}