package ro.fastrackit.tema5;

import java.util.Comparator;

public class AssignmentDifficultyComparator implements Comparator<Assignment> {


    @Override
    public int compare(Assignment one, Assignment two) {
        return one.getDifficultyLevel().compareTo(two.getDifficultyLevel());
    }
}


