import java.util.Scanner;

public class Vectores {

    public static void main (String[] args) {
        
        Scanner Lector = new Scanner(System.in);

         //===========================
            //1. CREAR EL VECTOR
            //===========================
            
            //Se reserva memoria para 15 números enteros
            int[] vector = new int[15];

            System.out.println("======================================");
            System.out.println("       PROGRAMA DE VECTORES");
            System.out.println("======================================");
            System.out.println("Memoria reservada para 15 vectores.");
            System.out.println();

            int opcion;

        // =====================================================
        // MENU PRINCIPAL
        // =====================================================

        do {

            System.out.println("\n======================================");
            System.out.println("              MENU");
            System.out.println("======================================");
            System.out.println("1. Llenar el vector");
            System.out.println("2. Buscar un valor en el vector");
            System.out.println("3. Determinar mayor y menor vector ingresado");
            System.out.println("4. Identificar múltiplos dentro del vector");
            System.out.println("5. Calcular la suma de los valores del vector");
            System.out.println("6. Crear vector con números por encima del promedio");
            System.out.println("0. Salir");
            System.out.println("======================================");

            System.out.print("Seleccione una opción: ");
            opcion = Lector.nextInt();

            switch (opcion) {

                // ==================
                // PUNTO 1
                // ==================

                case 1:
                    
                    System.out.println("\n=== 1. CREAR Y LLENAR EL VECTOR ===");   
                    
                    // Ciclo para llenar las 15 posiciones del vector
                    for (int i = 0; i < vector.length; i++) {

                        int numero;

                        do {
                            // Solicitar al usuario un número
                            System.out.print("Ingrese el valor para la posicion  [" + i +"] (entre 10 y 100): ");
                            numero = Lector.nextInt();

                            // Verificar que el número esté entre 10 y 100
                            if (numero < 10 || numero > 100) {
                                // Mostrar mensaje si el número está fuera del rango
                                System.out.println("El número está fuera del rango.");

                                // Volver a solicitar el número si no esta dentro del rano
                                System.out.print("Ingrese nuevamente el número: ");
                            
                            }

                        } while (numero < 10 || numero > 100);

                        // Guardamos el número en el vector
                        vector[i] = numero;

                    }

                    // Mostramos el vector completo
                    System.out.println("\n=== VECTOR INGRESADO ===");

                    for (int i = 0; i < vector.length; i++) {

                        System.out.println("Posición " + i + ": " + vector[i]);
                    }

                    break;

                //=======================================
                //PUNTO 2. BUSCAR UN VALOR EN EL VECTOR
                //========================================
                
                case 2:
                    
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

                    break;
        
                // ===============================================================
                //  PUNTO 3. ENCONTRAR EL MAYOR Y MENOR VALOR DENTRO DEL VECTOR
                // ===============================================================

                case 3:
                    
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

                    break;
            
                // =====================================================
                // PUNTO 4. IDENTIFICAR MÚLTIPLOS DE UN NÚMERO
                // =====================================================

                case 4:
                    
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

                    break;

                // =====================================================
                // PUNTO 5. CALCULAR LA SUMA DE TODOS LOS VALORES
                // =====================================================

                case 5:

                    System.out.println("\n=== SUMA DE LOS VALORES ===");

                    int suma = 0;

                    // Recorremos el vector para sumar todos sus elementos
                    for (int i = 0; i < vector.length; i++) {
                        suma = suma + vector[i];
                    }

                    System.out.println("La suma total es: " + suma);

                    break;

                // =====================================================
                // 6. CREAR VECTOR CON NÚMEROS POR ENCIMA DEL PROMEDIO
                // =====================================================

                case 6:

                    System.out.println("\n=== NÚMEROS POR ENCIMA DEL PROMEDIO ===");

                    // Calculamos la suma
                    int sumaPromedio = 0;

                    for (int i = 0; i < vector.length; i++) {

                        sumaPromedio = sumaPromedio + vector[i];
                    }
                    
                    // Calculamos el promedio de los valores del vector
                    double promedio = (double) sumaPromedio / vector.length;

                    // Mostramos el promedio calculado
                    System.out.println("El promedio es: " + promedio);
                    
                    // Contamos cuántos números son mayores que el promedio
                    int cantidadMayores = 0;
                    
                    // Recorremos el vector para encontrar los números mayores al promedio
                    for (int i = 0; i < vector.length; i++) {
                        
                        if (vector[i] > promedio) {
                            cantidadMayores++;
                        }
                    }

                    // Verificamos si hay números mayores que el promedio
                    if (cantidadMayores == 0) {

                        System.out.println("No hay números mayores que el promedio.");

                    } else {
            
                        // Creamos un nuevo vector con el tamaño necesario
                        int[] vectorMayores = new int[cantidadMayores];

                        int posicion = 0;

                    // Llenamos el nuevo vector
                    for (int i = 0; i < vector.length; i++) {

                        if (vector[i] > promedio) {
                            
                            vectorMayores[posicion] = vector[i];
                            posicion++;
                        }
                    }
            
                    // Mostramos el nuevo vector
                    System.out.println("Números por encima del promedio:");

                    for (int i = 0; i < vectorMayores.length; i++) {
                        
                        System.out.println("posicion [" + i + "]= " + vectorMayores[i]);
                    }

                    //Mostrar la cantidad
                    System.out.println("Cantidad de números por encima del promedio: " + cantidadMayores);
                }

                break;

                //===============
                // SALIR
                //===============

                case 0:

                    System.out.println("\nPrograma finalizado.");
                    System.out.println("¡Gracias por utilizar el programa!");

                    break;
                
                // =================================================
                // OPCION INCORRECTA
                // =================================================

                default:

                    System.out.println(
                            "\nOpción incorrecta. "
                            + "Seleccione una opción del menú.");

            }

        } while (opcion != 0);

        // Cerramos Scanner
        Lector.close();
    }
}