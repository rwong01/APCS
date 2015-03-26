public class lab7_4 {

	// Write 3 digits adjacent to each other.

	public static void main(String[] args){
		writeWithCommas(12837823);
		System.out.println();
		writeWithCommas((int)Math.pow(2, 64));
	}
	public static void writeThreeDigits(int n) {

		System.out.print(n / 100);

		System.out.print((n / 10) % 10);

		System.out.print(n % 10);

	}


	public static void writeWithCommas(int n) {

		if (n < 1000) {

			System.out.print(n);

		} else { 

			writeWithCommas(n / 1000);
			System.out.print(",");
			writeThreeDigits(n % 1000);

		}
	}
}
