package org.example.Teacher;

public class Teacher {

    protected String firstName;
    protected String lastName;
    protected String lesson;
    protected int classCount;

    public Teacher(String firstName, String lastName, String lesson, int classCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lesson = lesson;
        this.classCount = classCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
}

