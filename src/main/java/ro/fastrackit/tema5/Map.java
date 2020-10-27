package ro.fastrackit.tema5;

import java.util.HashMap;
import java.util.UUID;

public class Map {
    public static void main(String[] args) {
        Assignment one = new Assignment(UUID.randomUUID(), 1, "Class",
                "Create a Student Class", "Easy");
        Assignment two = new Assignment(UUID.randomUUID(), 1, "Fields",
                "Create fields in Student Class", "Easy");
        Assignment three = new Assignment(UUID.randomUUID(), 2, "Student Type",
                "Have the Student class return a StudentType in the getType method", "Medium");
        Assignment four = new Assignment(UUID.randomUUID(), 3, "Arithmetic",
                "Display all the prime numbers lower than a given number.", "Hard");

        HashMap<String, Assignment> assignmentsByCourse = new HashMap<>();
        assignmentsByCourse.put("Assignment 1", one);
        assignmentsByCourse.put("Assignment 2", two);
        assignmentsByCourse.put("Assignment 3", three);
        assignmentsByCourse.put("Assignment 4", four);

        System.out.println(assignmentsByCourse);

        System.out.println(assignmentsByCourse.get("Assignment 1"));


    }
}
