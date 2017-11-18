package com.peterson.spring.h2test.bootstrap;

import com.peterson.spring.h2test.model.Address;
import com.peterson.spring.h2test.model.Student;
import com.peterson.spring.h2test.model.Subject;
import com.peterson.spring.h2test.model.Teacher;
import com.peterson.spring.h2test.repositories.AddressRepo;
import com.peterson.spring.h2test.repositories.StudentRepo;
import com.peterson.spring.h2test.repositories.SubjectRepo;
import com.peterson.spring.h2test.repositories.TeacherRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private StudentRepo studentRepo;
    private SubjectRepo subjectRepo;
    private TeacherRepo teacherRepo;
    private AddressRepo addressRepo;

    public DevBootstrap(StudentRepo studentRepo, SubjectRepo subjectRepo, TeacherRepo teacherRepo, AddressRepo addressRepo) {
        this.studentRepo = studentRepo;
        this.subjectRepo = subjectRepo;
        this.teacherRepo = teacherRepo;
        this.addressRepo = addressRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //Teacher Dhanya
        Teacher dhanya=new Teacher("Dhanya","Babu");
        Subject ss=new Subject("Criminology");
        Student peter=new Student("Peter","Chiramel");
        Address peterAddress=new Address("Mumbai");
        dhanya.getStudents().add(peter);
        dhanya.getSubjects().add(ss);
        ss.getTeachers().add(dhanya);
        peter.getTeachers().add(dhanya);
        peter.setAddress(peterAddress);
        teacherRepo.save(dhanya);
        subjectRepo.save(ss);
        addressRepo.save(peterAddress);
        studentRepo.save(peter);


        //Teacher Peterson
        Teacher peterson=new Teacher("Peterson","Chiramel");
        Subject cs=new Subject("Computer Science");
        Student dhanyaBabu=new Student("Dhanya","Babu");
        Address dBAddress=new Address("Kerala");
        peterson.getSubjects().add(cs);
        peterson.getStudents().add(dhanyaBabu);
        cs.getTeachers().add(peterson);
        dhanyaBabu.getTeachers().add(peterson);
        dhanyaBabu.setAddress(dBAddress);

        teacherRepo.save(peterson);
        subjectRepo.save(cs);
        addressRepo.save(dBAddress);
        studentRepo.save(dhanyaBabu);

//Teacher Peterson
        Teacher pius=new Teacher("Pius","Chiramel");
        Subject history=new Subject("History");
        Student daison=new Student("Daison","Pius");
        Address dAddress=new Address("Thane");
        pius.getSubjects().add(history);
        pius.getStudents().add(daison);
        history.getTeachers().add(pius);
        daison.getTeachers().add(pius);
        daison.setAddress(dAddress);

        teacherRepo.save(pius);
        subjectRepo.save(history);
        addressRepo.save(dAddress);
        studentRepo.save(daison);

    }
}
