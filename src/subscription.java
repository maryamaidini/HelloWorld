/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 16/07/2012
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class subscription {

    private int price ; // subscription total price in euro-cent
    private int length ; // length of subscription in months

    // constructor :
    public subscription(int p, int n) {
        price = p ;
        length = n ;
    }

    /**
     * Calculate the monthly subscription price in euro,
     * rounded up to the nearest cent.
     */
    public int pricePerMonth() {
        int r =  price *  length ;
        return r ;
    }

    /**
     * Call this to cancel/nulify this subscription.
     */
    public void cancel() { length = 0 ; }

}