/*
  This is a program to find the 10,001st Prime number.
  For efficiency the count starts at 1 to account for the number 2, this allows us to skip dividing by even numbers
*/

public class ProjectEuler7 {
	public static void main(String[] args) {
		int primeCount=1;
		long start = System.currentTimeMillis();
		for (int i = 3; i <= 2147483647; i += 2) {
			if (primeTest(i)) {
				primeCount++;
				if (primeCount == 10001) {
					System.out.println("The 10,001st Prime is: "+i);
					long et = System.currentTimeMillis() - start;
					System.out.println("et: "+et);
					break;
				}
			}
		}
	}
	
	static boolean primeTest(int testee) {
		for (int i = 3; i < testee; i+=2) {
			if (testee % i == 0) {
				return false;
			}
		}
		return true;
	}
}