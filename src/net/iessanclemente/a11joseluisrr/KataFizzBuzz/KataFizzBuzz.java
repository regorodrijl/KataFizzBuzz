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

}
