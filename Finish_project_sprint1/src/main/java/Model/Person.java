package Model;

import java.time.LocalDateTime;

public class Person extends AbstractEntity {
    private String userName;
    private String fistName;
    private String lastName;
    private String Password;
    private LocalDateTime highDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public LocalDateTime getHighDate() {
        return highDate;
    }

    public void setHighDate(LocalDateTime highDate) {
        this.highDate = highDate;
    }
}
