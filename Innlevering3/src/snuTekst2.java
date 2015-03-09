import java.util.Scanner;

public class snuTekst2 {
	public static int count = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn en tekst: ");
		String s = input.nextLine();
		System.out.print("Teksten baklengs blir: ");
		reverseDisplay(s);

		System.out.print("\nAntall tegn er: " + count);
	}

	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length() - 1);
	}

	public static void reverseDisplay(String value, int high) {

		if (high >= 0) {
			System.out.print(value.charAt(high));
			count++;

			reverseDisplay(value, high - 1);

		}
	}
}
