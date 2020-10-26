package ro.fastrackit.tema5;

import java.util.Comparator;

public class AssignmentTitleComparator implements Comparator<Assignment> {

    @Override
    public int compare(Assignment one, Assignment two) {
        return one.getAssignmentTitle().compareTo(two.getAssignmentTitle());
    }
}
