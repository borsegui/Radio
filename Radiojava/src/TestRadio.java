import static org.junit.Assert.*;

import org.junit.Test;


public class TestRadio {
	
	Radio test = new Radio();
	@Test
	//Para sabe si se esta dando el cambio de estado de encendido a apagado
	public void testEstado() {
		boolean encendido = true;
		test.encenderApagar();
		assertEquals(encendido, test.getEstado());
	}
	
	@Test
	//Para saber si se esta subiendo el volumen del radio
	public void testVolumen() {
		int esperado = 1;
		test.subirVolumen();
		assertEquals(esperado, test.getVolumen());
	}

}
