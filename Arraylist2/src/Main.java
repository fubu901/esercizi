import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Creare un ArrayList con 12 elementi e stamparlo in console
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Roger", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Charlie", 21));
        studentList.add(new Student("David", 19));
        studentList.add(new Student("Emma", 23));
        studentList.add(new Student("Frank", 25));
        studentList.add(new Student("Adolf", 20));
        studentList.add(new Student("Harry", 24));
        studentList.add(new Student("Isabel", 22));
        studentList.add(new Student("Jack", 21));
        studentList.add(new Student("Katie", 19));
        studentList.add(new Student("Leo", 25));

        System.out.println("Collezione iniziale:");
        stampaCollezione(studentList);

        // Mettere in ordine la collezione e stampare il risultato
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("Collezione ordinata per nome:");
        stampaCollezione(studentList);
    }

    // Funzione per stampare il contenuto dell'ArrayList di Student
    private static void stampaCollezione(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
        System.out.println();
    }
}
