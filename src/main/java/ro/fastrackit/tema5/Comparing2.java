package ro.fastrackit.tema5;

import java.util.TreeSet;
import java.util.UUID;

public class Comparing2 {
    public static void main(String[] args) {
        Assignment one = new Assignment(UUID.randomUUID(), 4, "Class",
                "Create a Student Class", "Easy");
        Assignment two = new Assignment(UUID.randomUUID(), 1, "Fields",
                "Create fields in Student Class", "Easy");
        Assignment three = new Assignment(UUID.randomUUID(), 2, "Student Type",
                "Have the Student class return a StudentType in the getType method", "Medium");
        Assignment four = new Assignment(UUID.randomUUID(), 3, "Arithmetic",
                "Display all the prime numbers lower than a given number.", "Hard");

        AssignmentCourseNumberComparator comparator1 = new AssignmentCourseNumberComparator();
        TreeSet<Assignment> assignmentsSortedByCourse = new TreeSet<>(comparator1);

        assignmentsSortedByCourse.add(one);
        assignmentsSortedByCourse.add(two);
        assignmentsSortedByCourse.add(three);
        assignmentsSortedByCourse.add(four);

        System.out.println(assignmentsSortedByCourse);

        AssignmentTitleComparator comparator2 = new AssignmentTitleComparator();
        TreeSet<Assignment> assignmentsSortedByTitle = new TreeSet<>(comparator2);

        assignmentsSortedByTitle.add(one);
        assignmentsSortedByTitle.add(two);
        assignmentsSortedByTitle.add(three);
        assignmentsSortedByTitle.add(four);


        System.out.println(assignmentsSortedByTitle);

    }
}
