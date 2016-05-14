package net.iessanclemente.a11joseluisrr.KataFizzBuzz;

public class KataFizzBuzz {

	public static void main(String args) {
		String res = "";

		for (int i = 0; i < 100; i++) {
			res = number(i);
			System.out.println(res);
		}
	}

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
				if (numero % 3 == 0) {
					return "Fizz";
				}
				if (numero % 5 == 0) {
					return "Buzz";
				} else
					return String.valueOf(numero);
			}
		}
	} // fin numero()
	
	/**
	 * Requerimiento 1: -Un número es Fizz si es divisible por 3 o si incluye un
	 * 3 en el número.
	 * 
	 */
	public static String request3(int n) {
		// variable Boobleana para controlar si esta el numero
		Boolean elNumeroEsta = false;
		
		// paso el numero entero a String
		String numero = Integer.toString(n);
		// lo introduzco en un Array 
		int[] array = new int[numero.length()];
		
		for (int i = 0; i < numero.length(); i++) {
			// forzamos conversion de char a int para luego comprobar por int.
			array[i] = numero.charAt(i) - '0';
		}
		// recoremos el array para ver si esta el numero 3.
		for (int x = 0; x < array.length; x++) {
			// si esta
			if (3 == array[x]) {
				elNumeroEsta = true;
			}
		}

		if (elNumeroEsta == true) {
			return "Fizz";
		}else
			return "No tiene numero";

	}// fin request3
}
