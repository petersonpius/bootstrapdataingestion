package com.peterson.spring.h2test.Controller;

import com.peterson.spring.h2test.repositories.TeacherRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

    private TeacherRepo teacherRepo;

    public TeacherController(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @RequestMapping("/teachers")
    public String getTeachers(Model model){

        model.addAttribute("teachers",teacherRepo.findAll());
        return "teachers";
    }
}
