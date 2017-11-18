package com.peterson.spring.h2test.Controller;

import com.peterson.spring.h2test.repositories.StudentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    private StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
@RequestMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students",studentRepo.findAll());
        return "students";
    }
}
