import java.util.Scanner;



public class SnuTekst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn en tekst: ");
		String s = input.nextLine();
		System.out.print("Teksten baklengs blir: ");

		baklengs(s);
	}

	public static void baklengs(String tekst) {

		if (tekst.length() > 0) {

			System.out.print(tekst.charAt(tekst.length() - 1));
			baklengs(tekst.substring(0, tekst.length() - 1));

		}
	}

}


