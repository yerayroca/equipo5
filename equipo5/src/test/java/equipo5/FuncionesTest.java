package equipo5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionesTest {
	
	private Equipo5 funciones =new Equipo5 ();
	private int resultado;
	private int resultadoEsperado;

	@Test
	public void test() {
		resultadoEsperado = 9;
		resultado = funciones.cuadrado(3);
		assertEquals(resultadoEsperado, resultado);
	}

}
