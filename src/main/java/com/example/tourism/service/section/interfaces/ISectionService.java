package com.example.tourism.service.section.interfaces;

import com.example.tourism.model.Section;

import java.util.List;

public interface ISectionService {
    Section getById(String id);
    Section create(Section section);
    Section update(Section section);
    Section delete(String id);
    List<Section> getAll();
}
