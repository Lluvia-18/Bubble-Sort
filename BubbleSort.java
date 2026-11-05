package src;

// Ejercicio 1. Ordenamiento por Intercambio (Bubble Sort), del juego de tarjetas al código
// Autor: Lluvia Estefania Villanueva Lazo
// Fecha: Jueves 05 de Noviembre de 2026
// GTID244

public class BubbleSort {

    public static void main(String[] args) {

// Caso 1: Arreglo original
        int[] arreglo1 = {34, 12, 25, 8, 19};

// Caso 2: Arreglo ya ordenado
        int[] arreglo2 = {8, 12, 19, 25, 34};

// Caso 3: Arreglo en orden inverso
        int[] arreglo3 = {34, 25, 19, 12, 8};

        System.out.println("=== ARREGLO ORIGINAL ===");
        bubbleSort(arreglo1);

        System.out.println("\n=== ARREGLO YA ORDENADO ===");
        bubbleSort(arreglo2);

        System.out.println("\n=== ARREGLO EN ORDEN INVERSO ===");
        bubbleSort(arreglo3);
    }

    public static void bubbleSort(int[] numeros) {

// Obtiene la cantidad de elementos del arreglo
        int n = numeros.length;

// Variable para saber si hubo intercambios en una pasada
        boolean intercambio;

// Contadores
        int comparaciones = 0;
        int intercambios = 0;
        int pasadas = 0;

// Muestra el arreglo original
        System.out.print("Arreglo inicial: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

// Ciclo externo: controla las pasadas
        for (int i = 0; i < n - 1; i++) {

// Al inicio de cada pasada se supone que no habrá intercambios
            intercambio = false;

// Incrementa el contador de pasadas
            pasadas++;

// Ciclo interno: realiza las comparaciones
            for (int j = 0; j < n - i - 1; j++) {

// Cuenta cada comparación realizada
                comparaciones++;

// Si el número actual es mayor que el siguiente
                if (numeros[j] > numeros[j + 1]) {

// Intercambio usando una variable temporal
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;

// Cuenta el intercambio realizado
                    intercambios++;

// Indica que sí hubo intercambio en esta pasada
                    intercambio = true;
                }
            }

// Muestra el arreglo después de cada pasada
            System.out.print("Pasada " + pasadas + ": ");

            for (int num : numeros) {
                System.out.print(num + " ");
            }

            System.out.println();

// Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambio) {
                break;
            }
        }

 // Muestra el arreglo ordenado
        System.out.print("\nArreglo ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

// Muestra todo
        System.out.println("\n");
        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios: " + intercambios);
        System.out.println("Total de pasadas: " + pasadas);
    }
}
