package ro.fastrackit.tema5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class AssignmentCourseAndDifficultyComparator {

    public static void main(String[] args) {

        Assignment one = new Assignment();
        one.setCourseNumber(1);
        one.setDifficultyLevel("Easy");
        one.setAssignmentTitle("Clasa");

        Assignment two = new Assignment();
        two.setCourseNumber(4);
        two.setDifficultyLevel("Hard");
        two.setAssignmentTitle("Field");

        Assignment three = new Assignment();
        three.setCourseNumber(2);
        three.setDifficultyLevel("Medium");
        three.setAssignmentTitle("Constructor");

        Assignment four = new Assignment();
        four.setCourseNumber(3);
        four.setDifficultyLevel("Easy");
        four.setAssignmentTitle("Getter");

TreeSet<Assignment> assignments = new TreeSet<>(Comparator.comparing(Assignment::getCourseNumber)
.thenComparing(Assignment::getDifficultyLevel)
.thenComparing(Assignment::getAssignmentTitle));

assignments.add(one);
assignments.add(two);
assignments.add(three);
assignments.add(four);

        System.out.println(assignments);
    }







}

