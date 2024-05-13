import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTest2_Template {

//	@Test
//	void testTemplate() {
//		SbHard3.start(); // (re-) starting the SbHard3
//		SbHard3.getStateName(); // returns the name of the current state
//		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
//		SbHard3.transition("a"); // transition the current state with the given event
//		String stateName = SbHard3.getStateName();
//		assertEquals("S4", stateName);
//		fail("Not yet implemented");
//	}
	@Test
	void testWeg1() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("a"); // jetzt in S4
		SbHard3.transition("b"); // jetzt in S3
		SbHard3.transition("c"); // jetzt in S5
		SbHard3.transition("a"); // jetzt in S3
		String stateName = SbHard3.getStateName();
		assertEquals("S3", stateName);
	}
	@Test
	void testWeg2() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("a"); // jetzt in S4
		SbHard3.transition("c"); // jetzt in S6
		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}
	@Test
	void testWeg3() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("c"); // jetzt in S2
		SbHard3.transition("d"); // jetzt in S6
		SbHard3.transition("a"); // jetzt in Final
		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}
	@Test
	void testWeg4() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("e"); // jetzt in S2
		SbHard3.transition("d"); // jetzt in S6
		SbHard3.transition("d"); // jetzt in S5
		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}
	@Test
	void testWeg5() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("c"); // jetzt in S2
		SbHard3.transition("b"); // jetzt in S4
		String stateName = SbHard3.getStateName();
		assertEquals("S4", stateName);
	}
	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbHard3.evalCoverage(), "There are states or transitions left to cover!");

	}
	
}