import java.util.ArrayList;

public class Student {
    private String name;
    private int age;

    // Costruttore
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodo per ottenere il nome
    public String getName() {
        return name;
    }

    // Metodo per ottenere l'età
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Crea un ArrayList con n elementi e stamparlo in console
        ArrayList<Student> studenti = new ArrayList<>();

        // Aggiungere 4 elementi alla collezione
        studenti.add(new Student("Alice", 20));
        studenti.add(new Student("Bob", 22));
        studenti.add(new Student("Charlie", 21));
        studenti.add(new Student("David", 19));

        // Stampare la collezione aggiornata in console
        System.out.println("Collezione aggiornata:");
        for (Student studente : studenti) {
            System.out.println("Nome: " + studente.getName() + ", Età: " + studente.getAge());
        }
    }
}
