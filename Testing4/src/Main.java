import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        
        String inputString = "2023-03-01T13:00:00Z";
        LocalDateTime localDateTime = LocalDateTime.parse(inputString);

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);

        runTests();
    }

    private static void runTests() {

        String testInput = "2023-03-01T13:00:00Z";
        LocalDateTime testLocalDateTime = LocalDateTime.parse(testInput);
        int expectedYear = 2023;
        int expectedMonth = 3;
        int expectedDay = 1;
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        assert expectedYear == testLocalDateTime.getYear() :
                String.format("Test fallito. Atteso anno: %d, Ottenuto anno: %d", expectedYear, testLocalDateTime.getYear());
        assert expectedMonth == testLocalDateTime.getMonthValue() :
                String.format("Test fallito. Atteso mese: %d, Ottenuto mese: %d", expectedMonth, testLocalDateTime.getMonthValue());
        assert expectedDay == testLocalDateTime.getDayOfMonth() :
                String.format("Test fallito. Atteso giorno: %d, Ottenuto giorno: %d", expectedDay, testLocalDateTime.getDayOfMonth());
        assert expectedDayOfWeek == testLocalDateTime.getDayOfWeek() :
                String.format("Test fallito. Atteso giorno della settimana: %s, Ottenuto giorno della settimana: %s",
                        expectedDayOfWeek, testLocalDateTime.getDayOfWeek());

        System.out.println("Test superati con successo!");
    }
}
