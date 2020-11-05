package ro.fastrackit.tema5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListWithUniqueId {


    public static void main(String[] args) {
        List<Assignment> complete = new ArrayList<>() {
        };

        Assignment one = new Assignment(UUID.randomUUID(), 1, "Class",
                "Create a Student Class", "Easy");
        Assignment two = new Assignment(UUID.randomUUID(), 1, "Fields",
                "Create fields in Student Class", "Easy");
        Assignment three = new Assignment(UUID.randomUUID(), 2, "Student Type",
                "Have the Student class return a StudentType in the getType method", "Medium");
        Assignment four = new Assignment(UUID.randomUUID(), 3, "Arithmetic",
                "Display all the prime numbers lower than a given number.", "Hard");

        complete.add(one);
        complete.add(two);
        complete.add(three);
        complete.add(four);

        System.out.println("Mapped only with Unique ID");

        List<UUID> uniqueIdList = complete
                .stream()
                .map(Assignment::getUniqueId)
                .collect(Collectors.toList());

        System.out.println(uniqueIdList);

        System.out.println(" \nFilter Difficulty Level");

        List<Assignment> levelList = complete.stream()
                .filter(levelEasy -> levelEasy.getDifficultyLevel().equals("Easy"))
                .collect(Collectors.toList());
        System.out.println(levelList);

        System.out.println(" \n Map");

        HashMap<UUID, Assignment> map = (HashMap<UUID, Assignment>) complete.stream()
                .collect(Collectors.toMap(Assignment::getUniqueId, Function.identity()));


    }
}
