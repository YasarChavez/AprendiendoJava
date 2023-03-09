package ArgentinaProgramaEggJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúsculas:");
        String frase = String.valueOf(leer.next());
        convertirMayusculas(frase);
    }

    private static void convertirMayusculas(String a) {
        System.out.println(a.toUpperCase());
    }
}