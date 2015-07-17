
/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * @author   CHISTOPHER CHIROY, BORIS CIFUENTES,DIEGO DE LEÓN 
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRadio {
	
	Radio test = new Radio();
	/**
	 * Para sabe si se esta dando el cambio de estado de encendido a apagado
	 */
	@Test
	public void testEstado() {
		boolean encendido = true;
		test.encenderApagar();
		assertEquals(encendido, test.getEstado());
	}
	
	/**
	 * Para saber si se esta subiendo el volumen del radio
	 */
	@Test
	public void testVolumen() {
		int esperado = 1;
		test.subirVolumen();
		assertEquals(esperado, test.getVolumen());
	}

}
