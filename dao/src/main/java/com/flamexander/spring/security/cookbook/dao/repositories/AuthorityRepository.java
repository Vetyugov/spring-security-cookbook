package com.flamexander.spring.security.cookbook.dao.repositories;

import com.flamexander.spring.security.cookbook.dao.entities.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {
}
