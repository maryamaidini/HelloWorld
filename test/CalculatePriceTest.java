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

public class CalculatePriceTest {

    @Test
    public void CalculateTotalPrice() {
        CalculatePrice S = new CalculatePrice(100,2) ;
        assertEquals(200, S.TotalPrice());
    }


}
