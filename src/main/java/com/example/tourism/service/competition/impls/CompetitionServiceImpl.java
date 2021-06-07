package com.example.tourism.service.competition.impls;

import com.example.tourism.model.Competition;
import com.example.tourism.repository.CompetitionRepository;
import com.example.tourism.service.competition.interfaces.ICompetitionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CompetitionServiceImpl implements ICompetitionService {
    final CompetitionRepository repository;

    public CompetitionServiceImpl(CompetitionRepository competitionRepository) {
        this.repository = competitionRepository;
    }


    @Override
    public Competition getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Competition create(Competition competition) {
        return repository.save(competition);
    }

    @Override
    public Competition update(Competition competition) {
        return repository.save(competition);
    }

    @Override
    public Competition delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Competition> getAll() {
        return repository.findAll();
    }
}
