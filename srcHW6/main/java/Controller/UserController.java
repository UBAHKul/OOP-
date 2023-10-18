package Controller;

import Data.Users;
import java.time.LocalDate;

public interface UserController<T extends Users> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
