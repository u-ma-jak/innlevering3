import java.util.GregorianCalendar;

public class Ansatt extends Kort {

	public Ansatt(String forNavn, String etterNavn, int pin) {
		super(forNavn, etterNavn, pin);
	}

	@Override
	public boolean sjekkPin(int pin) {

		GregorianCalendar tidspunkt = new GregorianCalendar();

		int time = tidspunkt.get(GregorianCalendar.HOUR_OF_DAY);
		int dag = tidspunkt.get(GregorianCalendar.DAY_OF_WEEK);

		if (time < 7 || time > 17 || dag == 1 || dag == 7 && !super.isSperret())
			if (pin == super.getPIN())
				return true;
			else
				return false;
		if (!super.isSperret())
			return true;

		return false;

	}

}