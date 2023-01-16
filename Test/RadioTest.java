import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 1
 * 16-01-2023
 * Pruebas unitarias par ala clase Radio. 
 */

class RadioTest {

	Radio miRadio = new Radio();
	
	@Test
	void ForwardFMTest() {
		Radio miRadio = new Radio();
		miRadio.Forward();
		double estacion = miRadio.getFMActualStation();
		assertEquals(88.10000000000001, estacion);
	}

	@Test
	void onTest(){
		miRadio = new Radio();
		miRadio.on();
		assertEquals(true, miRadio.isOn());
	}

	@Test
	void offTest(){
		miRadio = new Radio();
		miRadio.off();
		assertEquals(false, miRadio.isOn());
	}

	
	/** 
	 * @throws Exception
	 */
	@Test
	void setFrequenceTest() throws Exception{
		miRadio = new Radio();
		miRadio.setFrequence("AM");
		assertEquals("AM", miRadio.getFrequence());
	}

	@Test
	void getFrequenceTest(){
		miRadio = new Radio();
		miRadio.getFrequence();
		assertEquals("FM", miRadio.getFrequence());
	}

	@Test
	void ForwardAMTest(){
		miRadio = new Radio();
		miRadio.Forward();
		assertEquals(540, miRadio.getAMActualStation());
	}

	@Test
	void BackwardAMTest(){
		miRadio = new Radio();
		miRadio.Backward();
		assertEquals(1610, miRadio.getAMActualStation());
	}
	
	@Test
	void BackwardFMTest(){
		miRadio = new Radio();
		miRadio.setFMActualStation(88.3);
		miRadio.Backward();
		assertEquals(88.1, miRadio.getFMActualStation());
	}

	@Test
	void getFMActualStationTest(){
		miRadio = new Radio();
		miRadio.getFMActualStation();
		assertEquals(87.9, miRadio.getFMActualStation());
	}

	@Test
	void getAMActualStationTest(){
		miRadio = new Radio();
		miRadio.getAMActualStation();
		assertEquals(530, miRadio.getAMActualStation());
	}

	@Test
	void setFMActualStationTest(){
		miRadio = new Radio();
		miRadio.setFMActualStation(89.1);
		assertEquals(89.1, miRadio.getFMActualStation());
	}

	@Test
	void setAMActualStationTest(){
		miRadio = new Radio();
		miRadio.setAMActualStation(550);
		assertEquals(550, miRadio.getAMActualStation());
	}

	@Test
	void saveFMStationTest(){
		miRadio = new Radio();
		miRadio.saveFMStation(89.1, 2);
		assertEquals(89.1, miRadio.getFMSlot(2));
	}

	@Test
	void saveAMStationTest(){
		miRadio = new Radio();
		miRadio.saveAMStation(600, 6);
		assertEquals(600, miRadio.getAMSlot(6));
	}

	@Test
	void getFMSlotTest(){
		miRadio = new Radio();
		miRadio.saveFMStation(89.7, 6);
		miRadio.getFMSlot(6);
		assertEquals(89.7, miRadio.getFMSlot(6));
	}

	@Test
	void getAMSlotTest(){
		miRadio = new Radio();
		miRadio.saveAMStation(610, 6);
		miRadio.getAMSlot(6);
		assertEquals(610, miRadio.getAMSlot(6));
	}
}
