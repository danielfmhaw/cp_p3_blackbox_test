import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;


import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BlackBoxTest_Template {

	@Test
	void testKlasse1(){
		Color expected = Color.RED;
		int x = -5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}


	@Test
	void testKlasse2(){
		Color expected = Color.YELLOW;
		int x = -5;
		int y = 10;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse3(){
		Color expected = Color.YELLOW;
		int x = -5;
		int y = 11;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse4(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse5(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = 10;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse6(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = 11;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse7(){
		Color expected = Color.YELLOW;
		int x = 100;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse8(){
		Color expected = Color.YELLOW;
		int x = 100;
		int y = 10;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse9(){
		Color expected = Color.GREEN;
		int x = 100;
		int y = 11;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	//Exceptions
	@Test
	void testKlasse10(){
		Color expected = null;
		int x = -21;
		int y = 0;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse11(){
		Color expected = Color.RED;
		int x = -5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse12(){
		Color expected = Color.RED;
		int x = -5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse13(){
		Color expected = Color.RED;
		int x = -5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
