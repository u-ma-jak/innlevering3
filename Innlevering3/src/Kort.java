import java.util.GregorianCalendar;

public abstract class Kort {
	private static int antallKort;
	private String forNavn;
	private String etterNavn;
	private int pin;
	private int kortNr;
	private boolean sperretKort = false;

	protected Kort(String forNavn, String etterNavn, int pin) {
		GregorianCalendar dato = new GregorianCalendar();
		this.forNavn = forNavn;
		this.etterNavn = etterNavn;
		this.pin = pin;
		kortNr = ++antallKort;
		sperretKort = false;

	}

	public abstract boolean sjekkPin(int pin);

	public String getForNavn() {
		return forNavn;
	}

	public void setForNavn(String forNavn) {
		this.forNavn = forNavn;
	}

	public String getEtterNavn() {
		return etterNavn;
	}

	public void setEtterNavn(String etterNavn) {
		this.etterNavn = etterNavn;
	}

	public int getPIN() {
		return pin;
	}

	public int getKortNr() {
		return kortNr;
	}

	public boolean isSperret() {
		return sperretKort;
	}

	public void toogleSperret() {
		sperretKort = !sperretKort;
	}

	public String toString() {
		return "Navn: " + etterNavn + " " + forNavn + " Pin: " + pin
				+ " Kortnr: " + kortNr + " Kortet er sperret: " + sperretKort;
	}

}
