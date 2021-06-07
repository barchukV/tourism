package com.example.tourism.service.competition.interfaces;

import com.example.tourism.model.Competition;

import java.util.List;

public interface ICompetitionService {
    Competition getById(String id);
    Competition create(Competition competition);
    Competition update(Competition competition);
    Competition delete(String id);
    List<Competition> getAll();
}
