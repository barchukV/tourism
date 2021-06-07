package com.example.tourism.repository;

import com.example.tourism.model.Amateur;
import com.example.tourism.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RouteRepository extends MongoRepository<Route, String > {
}
