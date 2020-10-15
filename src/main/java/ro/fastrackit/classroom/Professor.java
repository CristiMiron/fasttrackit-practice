package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Professor {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;

    public Professor(String lastName, String firstName, LocalDate dateOfBirth, LocalDate dateOfHiring, String emailAddress, Boolean isPhd) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.emailAddress = emailAddress;
        this.isPhd = isPhd;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
