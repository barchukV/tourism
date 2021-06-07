package com.example.tourism.service.section.impls;

import com.example.tourism.model.Section;
import com.example.tourism.repository.SectionRepository;
import com.example.tourism.service.section.interfaces.ISectionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class SectionServiceImpl implements ISectionService {
    final SectionRepository repository;

    public SectionServiceImpl(SectionRepository sectionRepository) {
        this.repository = sectionRepository;
    }


    @Override
    public Section getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Section create(Section section) {
        return repository.save(section);
    }

    @Override
    public Section update(Section section) {
        return repository.save(section);
    }

    @Override
    public Section delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Section> getAll() {
        return repository.findAll();
    }
}
