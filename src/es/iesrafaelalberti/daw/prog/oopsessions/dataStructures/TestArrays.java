package es.iesrafaelalberti.daw.prog.oopsessions.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class TestArrays {
    int[] qualifications = {2, 4, 9, 1}; // asignación estática, se declara antes de ejecutar nada
    Student[] students = { new Student("Ana", "Perez", 4.0f),
                           new Student("Luis", "González", 2.3f)
                         };
    List<Student> studentList = new ArrayList<>();

    public TestArrays() {
        // Tamaño de un array: qualifications.length
//        recorreQualifications();
//        int numeroAlumnos = 7;
//        qualifications = new int[numeroAlumnos]; // asignación de tamaño dinámica, durante la ejecución
//        for(int valor:qualifications) {
//            valor = 4;
//        }
//        recorreQualifications();
        recorreStudentList();
        studentList.add(new Student("Luis", "Gómez", 3.2f));
        recorreStudentList();
        for(Student student:studentList) {
            student.setQualification(5.1f);
        }
        recorreStudentList();

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