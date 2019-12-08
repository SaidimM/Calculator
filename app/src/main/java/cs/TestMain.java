/**
 * 
 */
package cs;


/**
 * @author chenruoyu
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger bInt = new BigInteger("+999999999999999999");
		BigInteger result = bInt.sub(new BigInteger("999999999999999998"));
		System.out.println(result);
	}
}
