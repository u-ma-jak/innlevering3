import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		// Lag en scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Oppgi antall skiver: ");
		int n = input.nextInt();

		// Finn løsningen rekursivt

		System.out.println("Trekkene er: ");
		moveDisks(n, 'A', 'B', 'C');

		trekk(count);
		kall(teller);

	}

	private static void trekk(int count2) {
		// Skriver ut antall trekk
		System.out.println("Antall trekk: " + count);
	}

	private static void kall(long teller2) {
		System.out.print("Antall kall: " + teller);

	}

	static long teller = 0;

	static int count = 0;

	// Metode som flytter n skiver fra tårn til tårn med hjelpetårn
	public static void moveDisks(int n, char fromTower, char toTower,
			char auxTower) {
		count++;
		if (n == 1) // stopp vilkår
			System.out.println("Flytt skive " + n + " fra " + fromTower
					+ " til " + toTower);

		else {
			moveDisks(n - 1, auxTower, toTower, fromTower);

			System.out.println("Flytt skive " + n + " fra " + fromTower
					+ " til " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
			
		}
		

	}

}
