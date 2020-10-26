package ro.fastrackit.tema5;

import java.util.HashMap;

public class AssignmentHashMap {
    public static void main(String[] args) {



    HashMap<String,Assignment> assignmentHashMap = new HashMap<>();

    Assignment one = new Assignment();
        one.setCourseNumber(1);
        one.setDifficultyLevel("Easy");
        assignmentHashMap.put("Assignment one ",one);


    Assignment two = new Assignment();
        two.setCourseNumber(4);
        two.setDifficultyLevel("Hard");
        assignmentHashMap.put("Assignment two ",two);

    Assignment three = new Assignment();
        three.setCourseNumber(2);
        three.setDifficultyLevel("Medium");
        assignmentHashMap.put("Assignment three ",three);

    Assignment four = new Assignment();
        four.setCourseNumber(3);
        four.setDifficultyLevel("Easy");
        assignmentHashMap.put("Assignment four ",four);

        System.out.println(assignmentHashMap);

    }
}
