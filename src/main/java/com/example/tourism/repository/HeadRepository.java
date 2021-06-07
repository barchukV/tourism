package com.example.tourism.repository;

import com.example.tourism.model.Amateur;
import com.example.tourism.model.Head;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  HeadRepository extends MongoRepository<Head, String > {
}
