package com.example.tourism.repository;

import com.example.tourism.model.Amateur;
import com.example.tourism.model.Groupp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  GrouppRepository extends MongoRepository<Groupp, String > {
}
