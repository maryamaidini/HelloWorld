/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 16/07/2012
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class CalculatePrice {

    private int price ;
    private int Quantity ;

    // constructor :
    public CalculatePrice(int p, int n) {
        price = p ;
        Quantity = n ;
    }

    /**
     * Calculate the monthly subscription price in euro,
     * rounded up to the nearest cent.
     */
    public int TotalPrice() {
        int r =  price *  Quantity ;
        return r ;
    }


}