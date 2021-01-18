package ro.fasttrackit.trainingspring.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.trainingspring.model.Student;

@RestController

public class StudentController {
    @GetMapping ("/api/student/{mesaj}")
    public String getFirstMessage(@PathVariable("mesaj") String mesajText){
        return "Salut" + mesajText;
    }
    @PostMapping (name = "/api/student")
    public Student createNewStudent(@RequestParam("lastname") String lastname,
                                    @RequestParam ("firstname") String firstname){
        Student newStudent = new Student();
        newStudent.setFirstName(firstname);
        newStudent.setLastName(lastname);
        return newStudent;

    }

}
