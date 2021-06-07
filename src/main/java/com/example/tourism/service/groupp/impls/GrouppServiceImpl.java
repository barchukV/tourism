package com.example.tourism.service.groupp.impls;

import com.example.tourism.model.Groupp;
import com.example.tourism.repository.GrouppRepository;
import com.example.tourism.service.groupp.interfaces.IGrouppService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class GrouppServiceImpl implements IGrouppService {
    final GrouppRepository repository;

    public GrouppServiceImpl(GrouppRepository grouppRepository) {
        this.repository = grouppRepository;
    }


    @Override
    public Groupp getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Groupp create(Groupp groupp) {
        return repository.save(groupp);
    }

    @Override
    public Groupp update(Groupp groupp) {
        return repository.save(groupp);
    }

    @Override
    public Groupp delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Groupp> getAll() {
        return repository.findAll();
    }
}
