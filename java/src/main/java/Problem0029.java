

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem0029 {

	public static void main(String[] args) {
		List<BigInteger> comb = new ArrayList<>();
		
		int start = 2;
		int limit = 100;
		for (int a = start; a <= limit; a++){
			for (int b = start; b <= limit; b++) {
				BigInteger c = BigInteger.valueOf(a).pow(b);
				if (!comb.contains(c)){
				comb.add(c);
				}
			}
			
		}
		
		for (BigInteger i : comb) {
			System.out.println(i);
		}
		System.out.println("Sum = " + comb.size());

	}

}
