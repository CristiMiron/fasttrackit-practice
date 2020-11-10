package ro.fastrackit.classroom;

import java.util.ArrayList;

public class GenericDemo {

    public static void main(String[] args) {
       ArrayList<? extends Human> humanList = createStudentList();
       Human a = humanList.get(0);
        System.out.println(humanList);

    }

    static ArrayList<Student> createStudentList (){
        ArrayList<Student> students = new ArrayList<>();
    Student cristi = new Student("Cristi", "Miron");
    Student nicolae = new Student("Nicolae", "Guta");
    Student calin = new Student("Calin", "Goia");
    students.add(cristi);
    students.add(nicolae);
    students.add(calin);
    return students;
    }

}
