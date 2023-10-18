package Data;

import java.time.LocalDate;

public interface User {

    String getFirstName();

    void setFirstName(String firstName);

    String getSecondName();

    void setSecondName(String secondName);

    String getPatronymic();

    void setPatronymic(String patronymic);

    LocalDate getDateOfBirth();

    void setDateOfBirth(LocalDate dateOfBirth);
}
