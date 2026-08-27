import java.util.Scanner;

public class Vectores {
      
    public static void main (String[] args) {
        
        Scanner Lector= new Scanner(System.in);

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

        public void buscar(int valorBuscado) {

             boolean encontrado = false;

             // Recorremos el vector buscando el número
            for (int i = 0; i < Lector.length; i++) {

                if (Lector[i] == valorBuscado) {
                
                    System.out.println("El número " + valorBuscado + " No existe el vector " + i);
                
                    encontrado = true;
            }
        }
    }
}