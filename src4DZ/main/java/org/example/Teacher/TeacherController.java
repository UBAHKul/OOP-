package org.example.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {
    private List<Teacher> teacherList = new ArrayList<>();
    private TeacherService service = new TeacherService();
    private TeacherView view = new TeacherView();

    public void createTeacher(String firstName, String lastName, String lesson, int classCount) {
        if (service.validateFirstName(firstName) && service.validateLastName(lastName)) {
            Teacher teacher = new Teacher(firstName, lastName, lesson, classCount);
            teacherList.add(teacher);
        } else {
            System.out.println("Error: Validation failed for teacher data.");
        }
    }

    public void displayTeacherList() {
        for (Teacher teacher : teacherList) {
            view.teacherView(teacher);
        }
    }

}

