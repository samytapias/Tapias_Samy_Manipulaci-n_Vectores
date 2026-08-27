import java.util.Scanner;

public class Vectores {
      
    public static void main (String[] args) {
        
        try (Scanner Lector = new Scanner(System.in)) {

            //===========================
            //1 CREAR Y LLENAR VECTORES
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
            // 2 BUSCAR UN VALOR EN EL VECTOR
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
        
            // =====================================================
            // 3. ENCONTRAR EL MAYOR Y MENOR VALOR DENTRO DEL VECTOR
            // =====================================================

            System.out.println("\n=== MAYOR Y MENOR ===");

             int mayor = vector[0];
             int menor = vector[0];

            // Recorremos el vector
            for (int i = 1; i < vector.length; i++) {

            // Comparamos para encontrar el mayor
            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            // Comparamos para encontrar el menor
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
             System.out.println("El número mayor es: " + mayor);
             System.out.println("El número menor es: " + menor);
            
             // =====================================================
             // 4. IDENTIFICAR MÚLTIPLOS DE UN NÚMERO
             // =====================================================

            System.out.println("\n=== MÚLTIPLOS ===");

            // Pedimos al usuario el número para buscar sus múltiplos
            System.out.print("\nIngrese un número X para buscar sus múltiplos: ");
             int X = Lector.nextInt();

              boolean hayMultiplos = false;

            // Verificamos que X no sea cero
             if (X == 0) {
            System.out.println("No se puede buscar múltiplos de 0.");
            } else {

            // Recorremos el vector
            for (int i = 0; i < vector.length; i++) {

                // Si el residuo es 0, significa que es múltiplo
                if (vector[i] % X == 0) {

                    System.out.println(vector[i]
                            + " es múltiplo de " + X);

                    hayMultiplos = true;
                }
            }

            // Si no encontramos ningún múltiplo
            if (hayMultiplos == false) {
                System.out.println("No hay múltiplos de "
                        + X + " en el vector.");
            }
        }
        }
    }
}