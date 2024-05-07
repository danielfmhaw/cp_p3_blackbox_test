import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BlackBoxTest_Template {

	@Test
	void testKlasse1(){
		Color actual = BlackBox1.G(-5, -1);
		assertEquals(Color.RED, actual);
	}
	@Test
	void testKlasse2(){
		Color actual = BlackBox1.G(-5, 10);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse3(){
		Color actual = BlackBox1.G(-5, 11);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse4(){
		Color actual = BlackBox1.G(10, -1);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse5(){
		Color actual = BlackBox1.G(10, 10);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse6(){
		Color actual = BlackBox1.G(10, 11);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse7(){
		Color actual = BlackBox1.G(100, -1);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse8(){
		Color actual = BlackBox1.G(100, 10);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void testKlasse9(){
		Color actual = BlackBox1.G(100,11);
		assertEquals(Color.GREEN, actual);
	}
	//Exceptions
	@Test
	void testKlasse10(){
		Color actual = BlackBox1.G(117, 101);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse11(){
		Color actual = BlackBox1.G(117, 66);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse12(){
		Color actual = BlackBox1.G(117, 5);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse13(){
		Color actual = BlackBox1.G(117, -1);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse14(){
		Color actual = BlackBox1.G(117, -2);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse15(){
		Color actual = BlackBox1.G(110, -2);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse16(){
		Color actual = BlackBox1.G(50, -2);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse17(){
		Color actual = BlackBox1.G(-5, -2);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse18(){
		Color actual = BlackBox1.G(-25, -2);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse19(){
		Color actual = BlackBox1.G(-25, -1);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse20(){
		Color actual = BlackBox1.G(-25, 5);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse21(){
		Color actual = BlackBox1.G(-25, 45);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse22(){
		Color actual = BlackBox1.G(-25, 120);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse23(){
		Color actual = BlackBox1.G(-5, 120);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse24(){
		Color actual = BlackBox1.G(37, 120);
		assertEquals(null, actual);
	}
	@Test
	void testKlasse25(){
		Color actual = BlackBox1.G(115, 120);
		assertEquals(null, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
