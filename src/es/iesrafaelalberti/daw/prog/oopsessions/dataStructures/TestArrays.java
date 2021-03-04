package es.iesrafaelalberti.daw.prog.oopsessions.dataStructures;

import java.util.*;
import java.util.function.Predicate;

public class TestArrays {
    int[] qualifications = {2, 4, 9, 1}; // asignación estática, se declara antes de ejecutar nada
    Student[] students = { new Student("Ana", "Perez", 4.0f),
                           new Student("Luis", "González", 2.3f)
                         };
    List<Student> studentList = new ArrayList<>();

    Set<Student> studentSet = new HashSet<>();

    public TestArrays() {
        // Tamaño de un array: qualifications.length
//        recorreQualifications();
//        int numeroAlumnos = 7;
//        qualifications = new int[numeroAlumnos]; // asignación de tamaño dinámica, durante la ejecución
//        for(int valor:qualifications) {
//            valor = 4;
//        }
//        recorreQualifications();
        //recorreStudentList();
        studentList.add(new Student("Luis", "Gómez", 4.98f));
        studentList.add(new Student("Luisa", "Gomeza", 8.0f));
        studentList.add(new Student("Mario", "Pérez", 4.9f));
        studentList.add(new Student("María", "Pereza", 6.2f));
        //recorreStudentList();
        studentList.removeIf( new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((Student) o).getName().equals("Mario") || ((Student) o).getName().equals("María");
            }
        });
        List<Student> tmp = new ArrayList<>();
        tmp.add(new Student("g", "t", 3.0f));
        tmp.add(new Student("fg", "ft", 3.0f));
        studentList.addAll(tmp);
        studentList.contains(new Student("g", "t", 3.0f));




        studentList.clear();
        for(Student student:studentList) {
            student.setQualification(5.1f);
        }
        //recorreStudentList();

    }

    public TestArrays(boolean ce) {
        Student student1 = new Student("Luis", "Polo", 3.0f);
        Student student2 = new Student("Luis", "Polo", 8.0f);
        if(student1.equals(student2)) {
            System.out.println("Son iguales!!!!!!");
        }

    }

    public void recorreQualifications() {
        // Recorrido por índice
        System.out.println("Recorrido por índice:");
        for(int i=0; i<qualifications.length; i++) {
            System.out.println(qualifications[i]);
        }
        System.out.println("Recorrido por valor:");
        // Recorrido estándar de una colección por valores
        for(int nota: qualifications) {
            System.out.println(nota);
        }
    }

    public void recorreStudents() {
        for(Student student: students) {
            System.out.println(student);
        }
    }

    public void recorreStudentList() {
        System.out.println("Listado de Estudiantes:");
        for(Student student: studentList) {
            System.out.println(student);
        }
    }
}