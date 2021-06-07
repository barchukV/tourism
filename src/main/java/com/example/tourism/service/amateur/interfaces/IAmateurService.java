package com.example.tourism.service.amateur.interfaces;

import com.example.tourism.model.Amateur;

import java.util.List;

public interface IAmateurService {
    Amateur getById(String id);
    Amateur create(Amateur amateur);
    Amateur update(Amateur amateur);
    Amateur delete(String id);
    List<Amateur> getAll();
}
