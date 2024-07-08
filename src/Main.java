import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
	public static void main( String[] args ) {

		/*
		Crea un nuovo oggetto di tipo ZonedDateTime per assegnare uno ZoneId ed evitare l'eccezione
		DateTimeException durante la formattazione
		 */
		ZonedDateTime data = ZonedDateTime.parse("2002-03-01T13:00:00Z");

		String fullData = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
		String medData = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		String shortData = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

		System.out.println("Data formattata in full: " + fullData);
		System.out.println("Data formattata in medium: " + medData);
		System.out.println("Data formattata in short: " + shortData);
	}
}