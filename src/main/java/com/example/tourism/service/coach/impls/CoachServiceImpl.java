package com.example.tourism.service.coach.impls;

import com.example.tourism.model.Coach;
import com.example.tourism.repository.CoachRepository;
import com.example.tourism.service.coach.interfaces.ICoachService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CoachServiceImpl implements ICoachService {
    final CoachRepository repository;

    public CoachServiceImpl(CoachRepository coachRepository) {
        this.repository = coachRepository;
    }


    @Override
    public Coach getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Coach create(Coach coach) {
        return repository.save(coach);
    }

    @Override
    public Coach update(Coach coach) {
        return repository.save(coach);
    }

    @Override
    public Coach delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Coach> getAll() {
        return repository.findAll();
    }
}
