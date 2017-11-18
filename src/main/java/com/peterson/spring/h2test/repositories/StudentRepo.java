package com.peterson.spring.h2test.repositories;

import com.peterson.spring.h2test.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Long>{
}
