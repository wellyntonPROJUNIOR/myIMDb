// Package where it is located
package co.wellymart.insertsSQL;
// Local files imports
import co.wellymart.classes.User;
import co.wellymart.connection.Connect;
// External libraries imports
import java.sql.PreparedStatement;
import java.sql.SQLException;

// User insertion to database
public class UserSQL {
    public void registerUser(User user) {
        String sql = "INSERT INTO user (name, nickname, email, password) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement ps = null;
            ps = Connect.getConnection().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getNickname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
