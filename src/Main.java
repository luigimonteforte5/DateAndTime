import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
	public static void main( String[] args ) {

		OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

		String fullData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		String medData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		String shortData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

		System.out.println("Data formattata in full: " + fullData);
		System.out.println("Data formattata in medium: " + medData);
		System.out.println("Data formattata in short: " + shortData);
	}
}