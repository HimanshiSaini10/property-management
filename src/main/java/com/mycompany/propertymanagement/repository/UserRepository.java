package com.mycompany.propertymanagement.repository;

import com.mycompany.propertymanagement.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    public Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);
}
