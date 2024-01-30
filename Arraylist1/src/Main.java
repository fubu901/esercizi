import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();


        studentList.add(new Student("Sollecito", 35));
        studentList.add(new Student("Turretta", 22));
        studentList.add(new Student("Stasi", 28));
        studentList.add(new Student("Bazzi", 50));


        System.out.println("Collezione iniziale:");
        stampaCollezione(studentList);


        studentList.add(new Student("Bossetti", 40));
        studentList.add(new Student("Guede", 25));
        studentList.add(new Student("Franzoni", 45));
        studentList.add(new Student("Misseri", 60));

        // Stampare la collezione aggiornata in console
        System.out.println("Collezione aggiornata:");
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
