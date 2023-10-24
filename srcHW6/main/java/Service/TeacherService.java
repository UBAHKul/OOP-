package Service;

import Data.Teacher;

public abstract class TeacherService implements UserService<Teacher>{

    public TeacherService() {
    }
    public boolean validateTeacher(Teacher teacher){
        if (teacher.getFirstName().length() < 2) {
            System.out.println("Имя введено неверно, введите заново!");
            return false;
        } else if (teacher.getSecondName().length() < 2) {
            System.out.println("Фамилия введена неверно, введите заново!");
            return false;
        }
        return true;
    }
}