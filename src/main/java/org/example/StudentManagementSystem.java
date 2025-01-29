package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem(){
        students=new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void deleteStudent(int id){
        students.removeIf(student -> student.getId()==id);
    }
    public void updateStudent(int id, String name, String surname, int age) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setSurname(surname);
                student.setAge(age);
                break;
            }
        }
    }
public void listAllStudents(){
        for (Student student: students){
            System.out.println(student);
        }
    }
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}