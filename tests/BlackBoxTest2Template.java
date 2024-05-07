import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BlackBoxTest_Template2 {

	public Color getActual(int x, int y, boolean b){
		return BlackBox2.F(x,y,b);
	}

	@Test
	void test1false() {
		Color actual = getActual(13,1,false);
		assertEquals(Color.GREEN, actual);
	}
	@Test
	void test1true() {
		Color actual = getActual(13,1,true);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void test2false() {
		Color actual = getActual(13,-1,false);
		assertEquals(Color.GREEN, actual);
	}
	@Test
	void test2true() {
		Color actual = getActual(13,-1,true);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void test3true() {
		Color actual = getActual(5,-1,true);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void test4false() {
		Color actual = getActual(5,1,false);
		assertEquals(Color.YELLOW, actual);
	}
	@Test
	void test4true() {
		Color actual = getActual(5,1,true);
		assertEquals(Color.RED, actual);
	}
	@Test
	void test5false() {
		Color actual = getActual(20,5,false);
        assertNull(actual);
	}
	@Test
	void test5true() {
		Color actual = getActual(20,5,true);
        assertNull(actual);
	}
	@Test
	void test6false() {
		Color actual = getActual(20,1,false);
        assertNull(actual);
	}
	@Test
	void test6true() {
		Color actual = getActual(20,1,true);
        assertNull(actual);
	}
	@Test
	void test7false() {
		Color actual = getActual(20,-1,false);
		assertNull(actual);	}
	@Test
	void test7true() {
		Color actual = getActual(20,-1,true);
		assertNull(actual);	}
	@Test
	void test8false() {
		Color actual = getActual(20,-5,false);
		assertNull(actual);	}
	@Test
	void test8true() {
		Color actual = getActual(20,-5,true);
		assertNull(actual);	}
	@Test
	void test9false() {
		Color actual = getActual(14,-5,false);
		assertNull(actual);	}
	@Test
	void test9true() {
		Color actual = getActual(14,-5,true);
		assertNull(actual);	}
	@Test
	void test10false() {
		Color actual = getActual(6,-5,false);
		assertNull(actual);}
	@Test
	void test10true() {
		Color actual = getActual(6,-5,true);
		assertNull(actual);	}
	@Test
	void test11false() {
		Color actual = getActual(1,-5,false);
		assertNull(actual);	}
	@Test
	void test11true() {
		Color actual = getActual(1,-5,true);
		assertNull(actual);	}
	@Test
	void test12false() {
		Color actual = getActual(1,-1,false);
		assertNull(actual);	}
	@Test
	void test12true() {
		Color actual = getActual(1,-1,true);
		assertNull(actual);	}
	@Test
	void test13false() {
		Color actual = getActual(1,1,false);
		assertNull(actual);	}
	@Test
	void test13true() {
		Color actual = getActual(1,1,true);
		assertNull(actual);	}
	@Test
	void test14false() {
		Color actual = getActual(1,5,false);
		assertNull(actual);	}
	@Test
	void test14true() {
		Color actual = getActual(1,5,true);
		assertNull(actual);	}
	@Test
	void test15false() {
		Color actual = getActual(5,5,false);
		assertNull(actual);	}
	@Test
	void test15true() {
		Color actual = getActual(5,5,true);
		assertNull(actual);	}
	@Test
	void test16false() {
		Color actual = getActual(13,5,false);
		assertNull(actual);	}
	@Test
	void test16true() {
		Color actual = getActual(13,5,true);
		assertNull(actual);	}
	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
