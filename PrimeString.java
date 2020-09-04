package hakerrank;

public class PrimeString {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		String str = "11373";
		//String str = "3175";
		int length = str.length();
		System.out.println("count :"+countPrimeStrings(str, length));

	}

	static boolean isPrimeorNot(String number) {
		int num = Integer.valueOf(number);
		for (int i = 2; i * i <= num; i++) {
			if ((num % i) == 0)
				return false;
		}
		System.out.println(num);
		return num > 1 ? true : false;
	}

	static int countPrimeStrings(String str, int length) {
		if (length == 0)
			return 1;
		
		int count = 0;
		for (int j = 1; j < str.length(); j++) {
			System.out.println(str.charAt(j));
			if (length - j >= 0 && str.charAt(length - j) != '0') {
				if (isPrimeorNot(str.substring(length - j, length))) {
					count += countPrimeStrings(str, length - j);
					count %= MOD;
				}
			}
		    //System.out.println(count);			
		}
		return count;
	}
}
