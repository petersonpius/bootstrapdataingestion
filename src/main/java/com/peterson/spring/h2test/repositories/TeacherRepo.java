package com.peterson.spring.h2test.repositories;

import com.peterson.spring.h2test.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher,Long> {
}
