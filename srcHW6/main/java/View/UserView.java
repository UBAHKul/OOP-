package View;

import Data.Users;
import java.util.List;

public interface UserView<T extends Users> {
    void sendOnConsole(List<T> list);
}
