package ro.fastrackit.tema5;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.UUID;

public class AssignmentCourseNumberComparator implements Comparator<Assignment> {

    @Override
    public int compare(Assignment one, Assignment two) {
        return Integer.compare(one.getCourseNumber(), two.getCourseNumber());
    }
}
