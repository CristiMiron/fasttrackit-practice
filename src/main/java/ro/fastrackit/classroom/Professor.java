package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Professor implements Human {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;
    private ProfessorType type;


    public Professor(String lastName, String firstName, Boolean isPhd) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.isPhd = isPhd;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }

    public void setType(ProfessorType type) { this.type = type; }

    @Override
    public int getIdNumber() { return getIdNumber(); }

    @Override
    public ScholarType getType() { return type; }
}
