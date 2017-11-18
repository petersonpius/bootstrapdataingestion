package com.peterson.spring.h2test.Controller;

import com.peterson.spring.h2test.repositories.SubjectRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class SubjectController {
    private SubjectRepo subjectRepo;

    public SubjectController(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    @RequestMapping("/Subjects")
    public String getSubjects(Model model){
        model.addAttribute("subjects",subjectRepo.findAll());
        return "subjects";
    }
}
