package org.example.Teacher;

public class TeacherService {

    public static void main(String[] args) {
        int test;
    }

    public boolean validateFirstName(String firstName) {
        return firstName != null && !firstName.isEmpty();
    }

    public boolean validateLastName(String lastName) {
        return lastName != null && !lastName.isEmpty();
    }

    public boolean validateLesson(String lesson) {
        return lesson != null && !lesson.isEmpty();
    }

    public boolean validateClassCount(int classCount) {
        return classCount != 0;
    }



}

