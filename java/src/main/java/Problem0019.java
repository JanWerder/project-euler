import java.time.LocalDate;


public class Problem0019 {
	
	public static void main(String[] args) {
		int counter = 0;
		
		LocalDate date = LocalDate.of(1901, 1, 6);

		while (date.isBefore(LocalDate.of(2000, 12, 31))) {
			if (date.getDayOfMonth() == 1) {
				counter++;
			}
			
			date = date.plusDays(7);
		}
		
		System.out.println("Counter = " + counter);
	}

}
