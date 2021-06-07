import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		// LOL
		System.out.println(getFactorial(100));
	}

    private static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
        	result = result.multiply(BigInteger.valueOf(i));
        }
        
        	
        return result;
    }


}
