package com.example.tourism.service.amateur.impls;

import com.example.tourism.model.Amateur;
import com.example.tourism.repository.AmateurRepository;
import com.example.tourism.service.amateur.interfaces.IAmateurService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class AmateurServiceImpl implements IAmateurService {
    final AmateurRepository repository;

    public AmateurServiceImpl(AmateurRepository amateurRepository) {
        this.repository = amateurRepository;
    }

    @Override
    public Amateur getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Amateur create(Amateur amateur) {
        return repository.save(amateur);
    }

    @Override
    public Amateur update(Amateur amateur) {
        return repository.save(amateur);
    }

    @Override
    public Amateur delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Amateur> getAll() {
        return repository.findAll();
    }
}
