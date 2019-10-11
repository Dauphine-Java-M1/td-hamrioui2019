package fr.dauphine.ja.hamriouiodile.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/**
 * TO EDIT THE NAME OF THE CLASS LET'S JUST USE ALT+SHIFT+R
 * */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    public void test0IsPrime() {
    	assertTrue(isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	assertTrue(isPrime(2));
    }

    public void test9IsNotPrime() {
    	assertTrue(!isPrime(9));

    }
    private boolean isPrime(int p) {
    	int i,test;
    	test=0;
    	if(p%2==0) {
    		test=1;
    	}
    	else {
    		for (i =3; i < p; i=i+2) {
    			if(p%i==0) {
    	    		test=1;
    	    	}
    		}
    			if(test==0) {
    				return true;
    			}
    			else {
    				return false;
    			}
    	}
		return true;
    }
   }
    
