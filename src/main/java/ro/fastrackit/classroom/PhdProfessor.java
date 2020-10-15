package ro.fastrackit.classroom;

import java.time.LocalDate;

public class PhdProfessor extends Professor{
    public PhdProfessor(String lastName, String firstName, LocalDate dateOfBirth, LocalDate dateOfHiring, String emailAddress, Boolean isPhd) {
        super(lastName, firstName, dateOfBirth, dateOfHiring, emailAddress, isPhd);
    }

    @Override
    public Boolean getPhd() {
        return super.getPhd();
    }
}
