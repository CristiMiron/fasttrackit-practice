package ro.fastrackit.tema5;

import java.util.TreeSet;
import java.util.UUID;

public class UniqueCollection {

    public static void main(String[] args) {


        Assignment one = new Assignment(UUID.randomUUID(), 1, "Class",
                "Create a Student Class", "Easy");
        Assignment two = new Assignment(UUID.randomUUID(), 1, "Fields",
                "Create fields in Student Class", "Easy");
        Assignment three = new Assignment(UUID.randomUUID(), 2, "Student Type",
                "Have the Student class return a StudentType in the getType method", "Medium");
        Assignment four = new Assignment(UUID.randomUUID(), 3, "Arithmetic",
                "Display all the prime numbers lower than a given number.", "Hard");

        TreeSet<Assignment> assignments = new TreeSet<>();
        assignments.add(one);
        assignments.add(two);
        assignments.add(three);
        assignments.add(four);
        System.out.println(assignments);
    }
}