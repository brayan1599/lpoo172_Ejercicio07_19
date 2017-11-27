/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_19;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

		// Prompt ther user a list
		System.out.print("Ingrese Lista: ");
		int[] lista = new int[input.nextInt()];
		for (int i = 0; i < lista.length; i++)
			lista[i] = input.nextInt();

		// Displays whether the list is sorted or not.
		System.out.println(
			"La lista es" + (isSorted(lista) ? "ya " : "no") + "ordenado");
	}

	/** isSorted returns true if the list is already sorted 
	*   in increasing order. Otherwise false */
	public static boolean isSorted(int[] lista) {
		for (int i = 0; i < lista.length - 1; i++) {
			if (lista[i] > lista[i + 1])
				return false;
		}
		return true;
	}
}
