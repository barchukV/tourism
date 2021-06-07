package com.example.tourism.service.coach.interfaces;

import com.example.tourism.model.Coach;

import java.util.List;

public interface ICoachService {
    Coach getById(String id);
    Coach create(Coach coach);
    Coach update(Coach coach);
    Coach delete(String id);
    List<Coach> getAll();
}
