package ro.fastrackit.classroom;

import java.time.LocalDate;

public class PhdProfessor extends Professor {
    public PhdProfessor(String lastName, String firstName, Boolean isPhd) {
        super(lastName, firstName, isPhd);
    }

    @Override
    public Boolean getPhd() {
        return super.getPhd();
    }
}
