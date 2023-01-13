import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/* * @author moises.alonso
 *
 */
class RadioTest {

	ICalculator miCalculadora = new CalculadoraSumas();
	
	@Test
	void SumaPositivosTest() {
		int result = miCalculadora.add(3, 5);
		assertEquals(8, result);
	}

	@Test
	void SumaDosEnterosPositivosTest(){
		CalculadoraSumas miCalculadora = new CalculadoraSumas();
		int resultado = miCalculadora.add(3,5);
		assertEquals(8, resultado);
	}

	@Test
	void SumaDosEnterosPrimeroNegativoTest(){
		CalculadoraSumas miCalculadora = new CalculadoraSumas();
		int resultado = miCalculadora.add(-3,5);
		assertEquals(2, resultado);
	}

	@Test
	void SumaDosEnterosNegativosTest(){
		CalculadoraSumas miCalculadora = new CalculadoraSumas();
		int resultado = miCalculadora.add(-3,-5);
		assertEquals(-8, resultado);
	}

	@Test
	void SumaDosEnterosUnoCeroTest(){
		CalculadoraSumas miCalculadora = new CalculadoraSumas();
		int resultado = miCalculadora.add(0,5);
		assertEquals(5, resultado);
	}
	
	@Test
	void SumaPrimeroNegativoTest() {
		int result = miCalculadora.add(-3, 5);
		assertEquals(2, result);
	}

}
