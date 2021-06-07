package com.example.tourism.service.sportsman.impls;

import com.example.tourism.model.Sportsman;
import com.example.tourism.repository.SportsmanRepository;
import com.example.tourism.service.sportsman.interfaces.ISportsmanService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class SportsmanServiceImpl implements ISportsmanService {
    final SportsmanRepository repository;

    public SportsmanServiceImpl(SportsmanRepository sportsmanRepository) {
        this.repository = sportsmanRepository;
    }


    @Override
    public Sportsman getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Sportsman create(Sportsman sportsman) {
        return repository.save(sportsman);
    }

    @Override
    public Sportsman update(Sportsman sportsman) {
        return repository.save(sportsman);
    }

    @Override
    public Sportsman delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Sportsman> getAll() {
        return repository.findAll();
    }
}
