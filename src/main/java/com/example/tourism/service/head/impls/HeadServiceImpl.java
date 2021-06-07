package com.example.tourism.service.head.impls;

import com.example.tourism.model.Head;
import com.example.tourism.repository.HeadRepository;
import com.example.tourism.service.head.interfaces.IHeadService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class HeadServiceImpl implements IHeadService {
    final HeadRepository repository;

    public HeadServiceImpl(HeadRepository headRepository) {
        this.repository = headRepository;
    }


    @Override
    public Head getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Head create(Head head) {
        return repository.save(head);
    }

    @Override
    public Head update(Head head) {
        return repository.save(head);
    }

    @Override
    public Head delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Head> getAll() {
        return repository.findAll();
    }
}
