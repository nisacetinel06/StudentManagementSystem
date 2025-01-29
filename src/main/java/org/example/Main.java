package org.example;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system=new StudentManagementSystem();
        Student student1=new Student(1126, "Nisa", "Çetinel",20);
        Student student2=new Student(1071, "Sultan", "Alparslan",35);
        system.addStudent(student1);
        system.addStudent(student2);

        System.out.println("-- Tüm Öğrenciler --");
        system.listAllStudents();

        system.updateStudent(1071, "Sultan", "Alparslan", 42);
        System.out.println("\nGüncellenmiş Öğrenci Listesi:");
        system.listAllStudents();

        system.deleteStudent(1071);
        System.out.println("\nSilme işlemi sonrası öğrenci listesi: ");
        system.listAllStudents();

        Student foundStudent=system.findStudentById(1126);
        if (foundStudent!= null){
            System.out.println("\nBulunan öğrenci: "+foundStudent);
        }else {
            System.out.println("\nÖğrenci bulunamadı.");
        }


    }
}