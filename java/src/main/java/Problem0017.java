import java.util.HashMap;
import java.util.Map;

public class Problem0017 {

	public static void main(String[] args) {
		long sum = 0L;

		Map<Integer, String> names = new HashMap<>();
		names.put(1, "one");
		names.put(2, "two");
		names.put(3, "three");
		names.put(4, "four");
		names.put(5, "five");
		names.put(6, "six");
		names.put(7, "seven");
		names.put(8, "eight");
		names.put(9, "nine");
		names.put(10, "ten");
		names.put(11, "eleven");
		names.put(12, "twelve");
		names.put(13, "thirteen");
		names.put(14, "fourteen");
		names.put(15, "fifteen");
		names.put(16, "sixteen");
		names.put(17, "seventeen");
		names.put(18, "eighteen");
		names.put(19, "nineteen");
		names.put(20, "twenty");
		names.put(21, "twentyone");
		names.put(22, "twentytwo");
		names.put(23, "twentythree");
		names.put(24, "twentyfour");
		names.put(25, "twentyfive");
		names.put(26, "twentysix");
		names.put(27, "twentyseven");
		names.put(28, "twentyeight");
		names.put(29, "twentynine");
		names.put(30, "thirty");
		names.put(31, "thirtyone");
		names.put(32, "thirtytwo");
		names.put(33, "thirtythree");
		names.put(34, "thirtyfour");
		names.put(35, "thirtyfive");
		names.put(36, "thirtysix");
		names.put(37, "thirtyseven");
		names.put(38, "thirtyeight");
		names.put(39, "thirtynine");
		names.put(40, "forty");
		names.put(41, "fortyone");
		names.put(42, "fortytwo");
		names.put(43, "fortythree");
		names.put(44, "fortyfour");
		names.put(45, "fortyfive");
		names.put(46, "fortysix");
		names.put(47, "fortyseven");
		names.put(48, "fortyeight");
		names.put(49, "fortynine");
		names.put(50, "fifty");
		names.put(51, "fiftyone");
		names.put(52, "fiftytwo");
		names.put(53, "fiftythree");
		names.put(54, "fiftyfour");
		names.put(55, "fiftyfive");
		names.put(56, "fiftysix");
		names.put(57, "fiftyseven");
		names.put(58, "fiftyeight");
		names.put(59, "fiftynine");
		names.put(60, "sixty");
		names.put(61, "sixtyone");
		names.put(62, "sixtytwo");
		names.put(63, "sixtythree");
		names.put(64, "sixtyfour");
		names.put(65, "sixtyfive");
		names.put(66, "sixtysix");
		names.put(67, "sixtyseven");
		names.put(68, "sixtyeight");
		names.put(69, "sixtynine");
		names.put(70, "seventy");
		names.put(71, "seventyone");
		names.put(72, "seventytwo");
		names.put(73, "seventythree");
		names.put(74, "seventyfour");
		names.put(75, "seventyfive");
		names.put(76, "seventysix");
		names.put(77, "seventyseven");
		names.put(78, "seventyeight");
		names.put(79, "seventynine");
		names.put(80, "eighty");
		names.put(81, "eightyone");
		names.put(82, "eightytwo");
		names.put(83, "eightythree");
		names.put(84, "eightyfour");
		names.put(85, "eightyfive");
		names.put(86, "eightysix");
		names.put(87, "eightyseven");
		names.put(88, "eightyeight");
		names.put(89, "eightynine");
		names.put(90, "ninety");
		names.put(91, "ninetyone");
		names.put(92, "ninetytwo");
		names.put(93, "ninetythree");
		names.put(94, "ninetyfour");
		names.put(95, "ninetyfive");
		names.put(96, "ninetysix");
		names.put(97, "ninetyseven");
		names.put(98, "ninetyeight");
		names.put(99, "ninetynine");

		for (int i = 1; i < 10; i++) {
			String name = names.get(i);
			int length = name.length();
			System.out.println("00" + i + " - " + name + " - " + length);
			sum += length;
		}

		for (int i = 10; i < 100; i++) {
			String name = names.get(i);
			int length = name.length();
			System.out.println("0" + i + " - " + name + " - " + length);
			sum += length;
		}

		for (int i = 1; i < 10; i++) {
			String hundred = names.get(i) + "hundred";
			int length = hundred.length();
			System.out.println("" + (i * 100) + " - " + hundred + " - " + length);
			sum += length;
			hundred = hundred += "and";
			for (int j = 1; j < 100; j++) {
				String name = hundred + names.get(j);
				length = name.length();
				System.out.println("" + (i * 100 + j) + " - " + name + " - " + length);
				sum += length;
			}
		}

		// int oneCount = 90;
		// sum += oneCount * "one".length();
		// sum += oneCount * "two".length();
		// sum += oneCount * "three".length();
		// sum += oneCount * "four".length();
		// sum += oneCount * "five".length();
		// sum += oneCount * "six".length();
		// sum += oneCount * "seven".length();
		// sum += oneCount * "eight".length();
		// sum += oneCount * "nine".length();

		// int tenCount = 100;
		// sum += tenCount * "twenty".length();
		// sum += tenCount * "thirty".length();
		// sum += tenCount * "forty".length();
		// sum += tenCount * "fifty".length();
		// sum += tenCount * "sixty".length();
		// sum += tenCount * "seventy".length();
		// sum += tenCount * "eighty".length();
		// sum += tenCount * "ninety".length();

		// int hundredCount = 900;
		// sum += hundredCount * "hundred".length();
		// sum += hundredCount * "and".length();

		// int specialCount = 10;
		// sum += specialCount * "ten".length();
		// sum += specialCount * "eleven".length();
		// sum += specialCount * "twelve".length();
		// sum += specialCount * "thirteen".length();
		// sum += specialCount * "fourteen".length();
		// sum += specialCount * "fifteen".length();
		// sum += specialCount * "sixteen".length();
		// sum += specialCount * "seventeen".length();
		// sum += specialCount * "eighteen".length();
		// sum += specialCount * "nineteen".length();

		// One Thousand
		String thousand = "one" + "thousand";
		int length = thousand.length();
		System.out.println("    - " + thousand + " - " + length);
		sum += length;

		System.out.println("Sum = " + sum);
	}
}
