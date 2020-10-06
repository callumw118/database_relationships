package com.codeclan.example.DBRelationships.repositories;

import com.codeclan.example.DBRelationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
