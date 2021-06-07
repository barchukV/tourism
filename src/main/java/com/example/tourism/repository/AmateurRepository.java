package com.example.tourism.repository;

import com.example.tourism.model.Amateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AmateurRepository extends MongoRepository<Amateur, String > {
}
