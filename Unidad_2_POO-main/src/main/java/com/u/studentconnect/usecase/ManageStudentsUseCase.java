package com.u.studentconnect.usecase;

import com.u.studentconnect.domain.Student;
import java.util.ArrayList;
import java.util.List;


public class ManageStudentsUseCase {
    private final List<Student> studentList = new ArrayList<>();

    public void registerStudent(Student student) {
    // Aquí se pueden añadir validaciones de negocio en el futuro
        studentList.add(student);
    }
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }
}