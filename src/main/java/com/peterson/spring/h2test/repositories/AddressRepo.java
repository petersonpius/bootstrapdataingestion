package com.peterson.spring.h2test.repositories;

import com.peterson.spring.h2test.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
