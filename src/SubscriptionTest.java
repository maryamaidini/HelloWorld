/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 16/07/2012
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */

import org.junit.* ;
import org.junit.Test;

import static org.junit.Assert.* ;

public class SubscriptionTest {

    @Test
    public void testReturnEuro() {
        System.out.println("Test if pricePerMonth returns Euro...") ;
        subscription S = new subscription(200,2) ;
        assertEquals(  400,S.pricePerMonth());
    }

    @Test
    public void test_roundUp() {
        System.out.println("Test if pricePerMonth rounds up correctly...") ;
        subscription S = new subscription(200,3) ;
        assertEquals(  600,S.pricePerMonth());
    }
}
