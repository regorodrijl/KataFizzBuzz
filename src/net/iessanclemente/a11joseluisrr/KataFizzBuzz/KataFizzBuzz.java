package net.iessanclemente.a11joseluisrr.KataFizzBuzz;

public class KataFizzBuzz {

	public static void main(String args) {
		String res = "";

		for (int i = 0; i < 100; i++) {
			res = number(i);
			System.out.println(res);
		}
	}// fin main

	/**
	 * number() Introduce un numero y comprueba si es null o no, tambien si es
	 * divisible por 3 y 5 para devolcer FIZZ en el caso de 3 y BUZ en el caso
	 * de 5, si es divisible por ambos devuelve FIZZBUZZ.
	 * 
	 * @param numero
	 *            String que contiene lo que es introducido, devulve dicho
	 *            numero parseado.
	 *
	 */
	public static String number(int numero) {
		// TODO Auto-generated method stub

		if (numero == 0) {
			return "0";
		} else {
			if (numero % 3 == 0 && numero % 5 == 0) {
				return "FizzBuzz";
			} else {
				/**
				 * Requerimiento 1: -Un número es Fizz si es divisible por 3 o
				 * si incluye un 3 en el número.
				 */
				// variable Boobleana para controlar si esta el numero
				Boolean elNumero3Esta = false;
				Boolean elNumero5Esta = false;

				// paso el numero entero a String
				String n = Integer.toString(numero);
				// lo introduzco en un Array
				int[] array = new int[n.length()];

				for (int i = 0; i < n.length(); i++) {
					// forzamos conversion de char a int para luego
					// comprobar por int.
					array[i] = n.charAt(i) - '0';
				}
				// recoremos el array para ver si esta el numero 3 o 5.
				for (int x = 0; x < array.length; x++) {
					// si esta el 3
					if (3 == array[x]) {
						elNumero3Esta = true;
						return "Fizz";
					} else {
						// si esta el 5
						if (5 == array[x]) {
							elNumero5Esta = true;
							return "Buzz";
						}
					}
				}
				if (numero % 3 == 0) {
					return "Fizz";
				}
				if (numero % 5 == 0) {
					return "Buzz";
				} else
					return String.valueOf(numero);
			} // fin else2
		} // fin else1
	} // fin numero()
}
