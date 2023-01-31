import me.tamarazolotovskaya.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    final String login = "login";
    final String mail = "mail@mail.ru";
    final User user = new User(login, mail);

    @Test
    public void UserCreate() {
        assertEquals(login, user.getLogin());
        assertEquals(mail, user.getMail());
    }

    @Test
    public void UserCreateWithoutParameters() {
        User defaultUser = new User();
        assertNull(defaultUser.getLogin());
        assertNull(defaultUser.getMail());
    }

    @Test
    @DisplayName("When the email contains . and @ then the email is correct")
    public void CorrectMail() {
        assertTrue(user.getMail().contains("@"), "Mail does not contain @");
        assertTrue(user.getMail().contains("."), "Mail does not contain .");
    }

    @Test
    @DisplayName("When login and email are not equal then they are correct")
    public void LoginMailEquals() {
        assertNotEquals(user.getLogin(), user.getMail(), "login and email are equal");
    }

}
