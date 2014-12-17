import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Problem0030 {
	
	 public static void main(String[] args) {
		 List<Integer> powInts = new ArrayList<>();
		 int limit = 10000000;
		 int pow = 5;
		 int start = 2; //ignore 1 for sum
		 
		for (Integer i = start; i < limit; i++) {
			String s = String.valueOf(i);
			char[] c = new char[s.length()];
			c = s.toCharArray();
			int sum = 0 ;
			for (int j = 0; j < c.length ;j++) {
				sum += new BigInteger(""+c[j]).pow(pow).intValue();
			}
			if (sum == i){
				powInts.add(i);
			}
		}
		
		
		int sum = 0;
		for (Integer i: powInts) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Result = " + sum);
	}
}
