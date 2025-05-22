// Package where it is located
package co.wellymart.classes;

// User creation
public class User {
    private String name;
    private String nickname;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 25) {
            this.name = name;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname.length() < 25) {
            this.nickname = nickname;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() < 110) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 255) {
            this.password = password;
        }
    }

}
