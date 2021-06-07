package com.example.tourism.repository;

import com.example.tourism.model.Amateur;
import com.example.tourism.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ScheduleRepository extends MongoRepository<Schedule, String > {
}
