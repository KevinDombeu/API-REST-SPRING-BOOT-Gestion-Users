package com.devbackend.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devbackend.api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
