package org.example.Teacher;

public class TeacherView {

    public void teacherView(Teacher teacher) {
        System.out.println("First Name: " + teacher.getFirstName());
        System.out.println("Last Name: " + teacher.getLastName());
        System.out.println("Lesson: " + teacher.getLesson());
        System.out.println("Class Count: " + teacher.getClassCount());
    }
}

