import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'oggetto LocalDateTime da una stringa
        String inputString = "2002-03-01T13:00";
        LocalDateTime localDateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        //  data in diversi stili
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a");
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a");

        // diverse versioni formattate
        System.out.println("Data formattata in stile FULL: " + localDateTime.format(fullFormatter));
        System.out.println("Data formattata in stile MEDIUM: " + localDateTime.format(mediumFormatter));
        System.out.println("Data formattata in stile SHORT: " + localDateTime.format(shortFormatter));
    }
}

