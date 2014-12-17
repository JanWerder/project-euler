import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class problem0025 {
	static List<BigInteger> knownFibs = new ArrayList<BigInteger>(); 
	
	public static void main(String[] args){
		knownFibs.add(BigInteger.valueOf(1));
		knownFibs.add(BigInteger.valueOf(2));
		
		Integer currFib = 3;
		
		while (fib(currFib-1).toString().length() < 1000){
			currFib += 1;
		}
		
		System.out.println(currFib+1);
	}
	
	public static BigInteger fib(int n){
		knownFibs.add(knownFibs.get(n-1).add(knownFibs.get(n-2)));
		return knownFibs.get(n);
	}
	
}
