import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTest1_Template_Konformanz {

// Für c nur Testfälle 2 und 5!!
    @Test
    void testWeg1() {
        SbSimple1.start(); // (re-) starting the SbSimple1
        SbSimple1.getStateName(); // returns the name of the current state
        SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
        SbSimple1.transition("b"); // jetzt in S2
        SbSimple1.transition("d"); // jetzt in S3
        SbSimple1.transition("b"); // jetzt in S1
        String stateName = SbSimple1.getStateName();
        assertEquals("S1", stateName);
    }
    @Test
    void testWeg2() {
        SbSimple1.start(); // (re-) starting the SbSimple1
        SbSimple1.getStateName(); // returns the name of the current state
        SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
        SbSimple1.transition("b"); // jetzt in S2
        SbSimple1.transition("d"); // jetzt in S3
        SbSimple1.transition("d"); // jetzt in S4
        String stateName = SbSimple1.getStateName();
        assertEquals("S4", stateName);
    }
    @Test
    void testWeg3() {
        SbSimple1.start(); // (re-) starting the SbSimple1
        SbSimple1.getStateName(); // returns the name of the current state
        SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
        SbSimple1.transition("b"); // jetzt in S2
        SbSimple1.transition("c"); // jetzt in S4
        SbSimple1.transition("b"); // jetzt in S2
        String stateName = SbSimple1.getStateName();
        assertEquals("S2", stateName);
    }
    @Test
    void testWeg4() {
        SbSimple1.start(); // (re-) starting the SbSimple1
        SbSimple1.getStateName(); // returns the name of the current state
        SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
        SbSimple1.transition("b"); // jetzt in S2
        SbSimple1.transition("c"); // jetzt in S4
        SbSimple1.transition("a"); // jetzt in Final
        String stateName = SbSimple1.getStateName();
        assertEquals("Final", stateName);
    }
    @Test
    void testWeg5() {
        SbSimple1.start(); // (re-) starting the SbSimple1
        SbSimple1.getStateName(); // returns the name of the current state
        SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
        SbSimple1.transition("b"); // jetzt in S2
        SbSimple1.transition("a"); // jetzt in Final
        String stateName = SbSimple1.getStateName();
        assertEquals("Final", stateName);
    }

    // ------- DO NOT TOUCH BELOW THIS LINE -------
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        assertTrue(SbSimple1.evalCoverage(), "There are states or transitions left to cover!");

    }

}