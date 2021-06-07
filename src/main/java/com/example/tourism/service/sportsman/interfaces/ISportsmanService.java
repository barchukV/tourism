package com.example.tourism.service.sportsman.interfaces;

import com.example.tourism.model.Sportsman;

import java.util.List;

public interface ISportsmanService {
    Sportsman getById(String id);
    Sportsman create(Sportsman sportsman);
    Sportsman update(Sportsman sportsman);
    Sportsman delete(String id);
    List<Sportsman> getAll();
}
