import java.util.GregorianCalendar;

public abstract class Kort {
	private static int antallKort;
	private String fornavn;
	private String etternavn;
	private int pin;
	private int kortNr;
	private boolean sperretKort = false;

	protected Kort(String fornavn, String etternavn, int pin) {
		GregorianCalendar dato = new GregorianCalendar();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pin = pin;
		kortNr = ++antallKort;
		sperretKort = false;

	}

	public abstract boolean sjekkPin(int pin);

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
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
		return "Navn: " + etternavn + " " + fornavn + " Pin: " + pin
				+ " Kortnr: " + kortNr + " Kortet er sperret: " + sperretKort;
	}

}
