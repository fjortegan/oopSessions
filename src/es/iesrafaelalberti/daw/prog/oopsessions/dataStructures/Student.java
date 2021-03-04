package es.iesrafaelalberti.daw.prog.oopsessions.dataStructures;

public class Student { // GRASP: maestro
    private String name;
    private String surname;
    private float qualification;

    public Student(String name, String surname, float qualification) {
        this.name = name;
        this.surname = surname;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getQualification() {
        return qualification;
    }

    public void setQualification(float qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", qualification=" + qualification +
                '}';
    }

    @Override
    public int hashCode() {
        return surname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Estamos comparando dos objetos de la clase Student");
        Student otroStudent = (Student) obj;
        return otroStudent.getName().equals(this.getName()) && otroStudent.getSurname().equals(this.getSurname());
    }
}
