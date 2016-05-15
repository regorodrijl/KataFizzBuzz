package net.iessanclemente.a11joseluisrr.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a11joseluisrr.KataFizzBuzz.KataFizzBuzz;

public class TestKataFizzBuzz {

	// variable que instancia la clase KataFizzBuzz para realizar los test
	private KataFizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = new KataFizzBuzz();
		// r3 = new newRequest3();
	}

	/**
	 * testIntroducirNadaDevuelveCero Introduciendo un 0 devuelve 0
	 * 
	 */
	@Test
	public void testIntroducirCeroDevuelveCero() {
		String return0 = fb.number(0);
		assertEquals("0", return0);
	}

	/**
	 * testIntroducirNumeroDevuelveNumero Introduciendo un nuemero devuelve el
	 * nuemro
	 * 
	 */
	@Test
	public void testIntroducirNumeroDevuelveNumero() {
		String returnNumber = fb.number(1);
		assertEquals("1", returnNumber);
	}

	/**
	 * testIntroducirTresDevuelveFizz Introduciendo el 3 devuelve Fizz
	 * 
	 */
	@Test
	public void testIntroducirTresDevuelveFizz() {
		String returnFizz = fb.number(3);
		assertEquals("Fizz", returnFizz);
	}

	/**
	 * testIntroducirCincoDevuelveBuzz Introduciendo el 5 devuelve Buzz
	 * 
	 */
	@Test
	public void testIntroducirCincoDevuelveBuzz() {
		String returnBuzz = fb.number(5);
		assertEquals("Buzz", returnBuzz);
	}

	/**
	 * testIntroducirNumeroDivisiblePorTresDevuelveFizz Introducir un numero
	 * divisible por 3 devuelve Fizz
	 */
	@Test
	public void testIntroducirNumeroDivisiblePorTresDevuelveFizz() {
		String returnFizz = fb.number(12);
		assertEquals("Fizz", returnFizz);
	}

	/**
	 * testIntroducirNumeroDivisiblePorTresDevuelveFizz Introducir un numero
	 * divisible por 5 devuelve Buzz
	 */
	@Test
	public void testIntroducirNumeroDivisiblePorCincoDevuelveBuzz() {
		String returnBuzz = fb.number(10);
		assertEquals("Buzz", returnBuzz);
	}

	/**
	 * testIntroducirNumeroDivisiblePorTresYCincoDevuelveFizzBuzz Introducir un
	 * numero divisible por 3 y 5 devuelve FizzBuzz
	 */
	@Test
	public void testIntroducirNumeroDivisiblePorTresYCincoDevuelveFizzBuzz() {
		String returnFizzBuzz = fb.number(15);
		assertEquals("FizzBuzz", returnFizzBuzz);
	}

	/**
	 * testRequest3esDivisiblePor3Ytiene3DevueveFizz Un número es Fizz si es
	 * divisible por 3 o si incluye un 3 en el número comprobado con el numero
	 * 33, 13 y el 4356 por cercionarme.
	 */
	@Test
	public void testRequest3esDivisiblePor3Ytiene3DevueveFizz() {
		String returnFizz = fb.number(13); // probado con 33
		assertEquals("Fizz", returnFizz);
	}

	/**
	 * testRequest5esDivisiblePor5oTiene5DevueveBuezz Un número es Buzz si es
	 * divisible por 5 o si incluye un 5 en el número
	 */
	@Test
	public void testRequest5esDivisiblePor5oTiene5DevueveBuezz() {
		String returnBuzz = fb.number(52);
		assertEquals("Buzz", returnBuzz);
	}
	
	/**
	 * testRequest5Ytiene3 
	 * Si se introduce un numero que tenga tanto el 3 como el 5
	 */
	@Test
	public void testRequest5Ytiene3() {
		String returnBuzz = fb.number(523);
		assertEquals("los2", returnBuzz);
	}
}
