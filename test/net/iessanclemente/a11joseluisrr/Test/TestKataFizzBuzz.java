package net.iessanclemente.a11joseluisrr.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a11joseluisrr.KataFizzBuzz.KataFizzBuzz;

public class TestKataFizzBuzz {

	// variable que instancia la clase KataFizzBuzz para realizar los test
	private KataFizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = new KataFizzBuzz();
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
	 * testIntroducirNumeroDivisiblePorTresDevuelveFizz
	 * Introducir un numero divisible por 3 devuelve 3
	 */
	@Test
	public void testIntroducirNumeroDivisiblePorTresDevuelveFizz() {
		String returnFizz = fb.number(45);
		assertEquals("Fizz", returnFizz);
	}
}
