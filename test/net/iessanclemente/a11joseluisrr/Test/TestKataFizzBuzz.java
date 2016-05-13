package net.iessanclemente.a11joseluisrr.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a11joseluisrr.KataFizzBuzz.KataFizzBuzz;

public class TestKataFizzBuzz {

	private KataFizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new KataFizzBuzz();
	}

	@Test
	public void testIntroducirNadaDevuelveCero() {
		int return0 = fb.number("");
		assertEquals(0, return0);
	}
	
	@Test
	public void testIntroducirNumeroDevuelveNumero() {
		int returnNumber = fb.number("1");
		assertEquals(1, returnNumber);
	}
}
