package com.peterson.spring.h2test.repositories;

import com.peterson.spring.h2test.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject,Long> {
}
