package pl.pawc.game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase{

    public MainTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(MainTest.class);
    }

    public void testMain(){
        assertTrue(true);
    }
}