// Local files imports
import co.wellymart.classes.User;
import co.wellymart.insertsSQL.UserSQL;

public class Main {
    public static void main(String[] args) {
        User userA = new User();
        userA.setName("Wellynton João Martins");
        userA.setNickname("tonAmaTami");
        userA.setEmail("wellyntonjoaomartins@gmail.com");
        userA.setPassword("130507ws");

        new UserSQL().registerUser(userA);
    }
}
