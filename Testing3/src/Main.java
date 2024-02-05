import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        String formattedDate = formatDate(offsetDateTime);

        System.out.println(formattedDate);

        runTests();
    }

    private static String formatDate(OffsetDateTime offsetDateTime) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return offsetDateTime.format(formatter);
    }

    private static void runTests() {
        String testInput = "2023-03-01T13:00:00Z";
        OffsetDateTime testOffsetDateTime = OffsetDateTime.parse(testInput);
        String expectedResult = "01 marzo 2023";
        String actualResult = formatDate(testOffsetDateTime);

        assert expectedResult.equals(actualResult) :
                String.format("Test fallito. Atteso: %s, Ottenuto: %s", expectedResult, actualResult);

        System.out.println("Test superati con successo!");
    }
}
