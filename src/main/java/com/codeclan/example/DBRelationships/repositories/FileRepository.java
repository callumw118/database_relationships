package com.codeclan.example.DBRelationships.repositories;

import com.codeclan.example.DBRelationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
