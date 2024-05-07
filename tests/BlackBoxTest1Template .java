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
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}


	@Test
	void testKlasse2(){
		Color expected = Color.YELLOW;
		int x = -5;
		int y = 10;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse3(){
		Color expected = Color.YELLOW;
		int x = -5;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse4(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse5(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = 10;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse6(){
		Color expected = Color.YELLOW;
		int x = 10;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse7(){
		Color expected = Color.YELLOW;
		int x = 100;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse8(){
		Color expected = Color.YELLOW;
		int x = 100;
		int y = 10;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse9(){
		Color expected = Color.GREEN;
		int x = 100;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	//Exceptions
	@Test
	void testKlasse10(){
		Color expected = null;
		int x = 117;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse11(){
		Color expected = null;
		int x = 117;
		int y = 66;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse12(){
		Color expected = null;
		int x = 117;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse13(){
		Color expected = null;
		int x = 117;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse14(){
		Color expected = null;
		int x = 117;
		int y = -2;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse15(){
		Color expected = null;
		int x = 110;
		int y = -2;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse16(){
		Color expected = null;
		int x = 50;
		int y = -2;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse17(){
		Color expected = null;
		int x = -5;
		int y = -2;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse18(){
		Color expected = null;
		int x = -25;
		int y = -2;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse19(){
		Color expected = null;
		int x = -25;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse20(){
		Color expected = null;
		int x = -25;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse21(){
		Color expected = null;
		int x = -25;
		int y = 45;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse22(){
		Color expected = null;
		int x = -25;
		int y = 120;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse23(){
		Color expected = null;
		int x = -5;
		int y = 120;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse24(){
		Color expected = null;
		int x = 37;
		int y = 120;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
	@Test
	void testKlasse25(){
		Color expected = null;
		int x = 115;
		int y = 120;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
